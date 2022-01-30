package testAplikasiSPV.pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import testAplikasiSPV.driver.DriverAndroid;

public class PageGabungan {
	////////////// DAFTAR ABSENSI///////////////
	private final By btnDaftarAbsensi = By.xpath(("//android.view.View[@content-desc=\"Daftar Absensi\"]"));
	private final By listKategori = By.xpath("//android.view.View[1]");
	private final By btnAbsen = By.xpath("//android.view.View[@content-desc=\"Absen\"]");
	private final By btnTelat = By.xpath("//android.view.View[@content-desc=\"Telat\"]");
	private final By btnPulangCepat = By.xpath("//android.view.View[@content-desc=\"Pulang Cepat\"]");
	private final By btnLembur = By.xpath("//android.view.View[@content-desc=\"Lembur\"]");
	private final By btnIzin = By.xpath("//android.view.View[@content-desc=\"Izin\"]");
	private final By btnCuti = By.xpath("//android.view.View[@content-desc=\"Cuti\"]");

	private final By lstPilihWaktu = By.xpath("//android.widget.Button[@content-desc=\"Pilih Waktu...\"]");
	private final By lstPilihWaktuDaily = By.xpath("//android.widget.Button[@content-desc=\"Daily\"]");
	private final By lstPilihWaktuWeekly = By.xpath("//android.widget.Button[@content-desc=\"Weekly\"]");

	private final By btnDaily = By.xpath("//android.view.View[@content-desc=\"Daily\"]");
	private final By btnWeekly = By.xpath("//android.view.View[@content-desc=\"Weekly\"]");
	private final By btnMonthly = By.xpath("//android.view.View[@content-desc=\"Monthly\"]");

	private final By btnCalendar = By.xpath("//android.widget.Button[3]");
	private final By btnCalendar1 = By.xpath("//android.widget.Button[4]");
	private final By btnDate = By.xpath("//android.view.View[@content-desc=\"23, Sunday, January 23, 2022\"]");
	private final By btnOK4 = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");

	private final By lstBelumTerproses = By.xpath("//android.widget.Button[@content-desc=\"Belum Terproses\"]");

	private final By lstApproved = By.xpath("//android.view.View[@content-desc=\"Approved\"]");

	private final By lstRejected = By.xpath("//android.view.View[@content-desc=\"Rejected\"]");

	private final By btnSearch = By.xpath("//android.widget.Button[@content-desc=\"SEARCH\"]");
	private final By btnRefresh4 = By.xpath("//android.widget.Button[@content-desc=\"REFRESH\"]");

	////////////// ABSEN MASUK//////////////////
	private final By btnKamera3 = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View");
	private final By btnKamera = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
	private final By btnWidget = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
	private final By btnRefresh = By.xpath("//android.view.View[@content-desc=\"REFRESH\"]");
	private final By lstAlasanTelat = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	private final By KendalaPerjalanan = By.xpath("//android.view.View[@content-desc=\"Kendala Perjalanan\"]");
	private final By UrusanPribadi = By.xpath("//android.view.View[@content-desc=\"Urusan Pribadi\"]");
	private final By UrusanPekerjaan = By.xpath("//android.view.View[@content-desc=\"Urusan Pekerjaan\"]");
	private final By Lainnya = By.xpath("//android.view.View[@content-desc=\"Lainnya\"]");
	private final By TXTLainnya = By.className("android.widget.EditText");
	private final By btnLanjutkan = By.xpath("//android.widget.Button[@content-desc=\"LANJUTKAN\"]");
	private final By TXTLuarJarak = By.className("android.widget.EditText");
	private final By AbsenMasuk = By.xpath("//android.view.View[@content-desc=\"Absen Masuk\"]");
	private final By btnUlangiSelfie = By.xpath("//android.view.View[@content-desc=\"Ulangi Selfie\"]");
	private final By btnKirimData = By.xpath("//android.view.View[@content-desc=\"Kirimkan Data\"]");
	private final By btnOK1 = By.xpath("//android.view.View[@content-desc=\"OK\"]");
	private final By btnSelesai = By.xpath("//android.view.View[@content-desc=\"SELESAI\"]");
	private final By btnUlangiFoto = By.xpath("//android.widget.Button[@content-desc=\"Ulangi Foto\"]");
	/////////// REGISTER/////////////
	private final By btnRegister = By.xpath("//android.widget.Button[@content-desc=\"REGISTER\"]");
	private final By btnUntukFoto = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.Button[1]");
	private final By btnAmbilFoto = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View");
	private final By btnOK = By.xpath("//android.view.View[@content-desc=\"OK\"]");
	private final By TXTNama = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
	private final By TXTNIK = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
	private final By TXTEmail = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");
	private final By TXTPassword = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.EditText[4]");
	////////// Login ////////////////
	private final By NIKTextBox = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
	private final By passwordTextBox = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
	private final By btnMasuk = By.xpath("//android.widget.Button[@content-desc=\"MASUK\"]");
	// private final By attemptsCounterLabel =
	// By.id("com.maxsoftlk.loginapplication:id/tvAttemptsInfo");

	////////// Ijin ////////////////
	private final By gotoIjin = By.xpath("//android.view.View[@content-desc=\"Izin\"]");
	private final By dropdownKategori = By.xpath(
			"//android.widget.Button[@content-desc=\"Nama Lengkap : syaeful anwar NIK : 87654321 Deskripsi : Pilih Kategori Izin... Waktu Pengajuan Izin : Tue, 25/01/2022 at 09:33\"]");
	private final By listSakit = By.xpath("//android.view.View[@content-desc=\"Sakit\"]");

	private final By toogleHari = By.xpath(
			"//android.view.View[@content-desc=\"Nama Lengkap : syaeful anwar NIK : 87654321 Deskripsi : Waktu Pengajuan Izin : Mon, 24/01/2022 at 20:36 Lama Hari Izin Sakit : 1 Hari > 1 Hari\"]/android.widget.Switch");
	private final By btnTanggalDari = By.className("android.widget.Button[2]");
	private final By pilihTanggalDari = By.xpath("//android.view.View[@content-desc=\"1, Tuesday, February 1, 2022\"]");
	private final By klikOk1 = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
	private final By btnTanggalSampai = By.xpath("android.widget.Button[3]");
	private final By pilihTanggalSampai = By
			.xpath("//android.view.View[@content-desc=\"2, Wednesday, February 2, 2022\"]");
	private final By klikOk2 = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
	private final By btnFoto = By.xpath("//android.view.View/android.widget.Button[3]");
	private final By ambilFoto = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View");
	private final By klikLanjutkan = By.xpath("//android.widget.Button[@content-desc=\"LANJUTKAN\"]");
	private final By okAlert = By.xpath("//android.view.View[@content-desc=\"OK\"]");
	private final By listLainnya = By.xpath("//android.view.View[@content-desc=\"Lainnya\"]");
	private final By formAlasan = By.xpath("//*[@class ='android.widget.EditText' and contains(@index,'1')]");
	private final By btnKlikFoto2 = By.xpath("//*[@class ='android.widget.Button' and contains(@elementId,'13')]");

	private final AndroidDriver<MobileElement> driver;

	public PageGabungan(AndroidDriver<MobileElement> driver) throws Exception {
		driver = DriverAndroid.getDriver();
		this.driver = driver;
	}

	//////////////// ABSEN MASUK/////////////////
	public void clickAbsenMasuk() {
		driver.findElement(AbsenMasuk).click();
	}

	public void clickBtnKamera() {
		driver.findElement(btnKamera).click();
	}

	public void clickBtnKamera3() {
		driver.findElement(btnKamera3).click();
	}

	public void clickUlangiSelfie() {
		driver.findElement(btnUlangiSelfie).click();
	}

	public void clickKirimData() {
		driver.findElement(btnKirimData).click();
	}

	public void clickTXTLuarJarak(String jarak) {
		driver.findElement(TXTLuarJarak).click();
		driver.findElement(TXTLuarJarak).sendKeys(jarak);
	}

	public void clickOKAbsen() {
		driver.findElement(btnOK1).click();
	}

	public void clickSelesai() {
		driver.findElement(btnSelesai).click();
	}

	public void clickUlangiFoto() {
		driver.findElement(btnUlangiFoto).click();
	}

	public void clickWidget() {
		driver.findElement(btnWidget).click();
	}

	public void clickRefresh() {
		driver.findElement(btnRefresh).click();
	}

	public void clicklstAlasanTelat() {
		driver.findElement(lstAlasanTelat).click();
	}

	public void clicklstKendalaPerjalanan() {
		driver.findElement(KendalaPerjalanan).click();
	}

	public void clicklstUrusanPribadi() {
		driver.findElement(UrusanPribadi).click();
	}

	public void clicklstUrusanPekerjaan() {
		driver.findElement(UrusanPekerjaan).click();
	}

	public void clicklstLainnya() {
		driver.findElement(Lainnya).click();
	}

	public void clickTXTLainnya(String lainnya) {
		driver.findElement(TXTLainnya).click();
		driver.findElement(TXTLainnya).sendKeys(lainnya);
	}

	public void clickLanjutkan() {
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(100, 100)).moveTo(PointOption.point(200, 200)).release().perform();
		driver.findElement(btnLanjutkan).click();
	}

	//////////// REGISTER //////////////////////
	public void clickRegister() {
		driver.findElement(btnRegister).click();
	}

	public void clickUntukFoto() {
		driver.findElement(btnUntukFoto).click();
	}

	public void clickAmbilFoto() {
		driver.findElement(btnAmbilFoto).click();
	}

	public void clickOK() {
		driver.findElement(btnOK).click();
	}

	public void setNama1(String nama) {
		driver.findElement(TXTNama).click();
		driver.findElement(TXTNama).sendKeys(nama);
	}

	public void setNIK1(String nik) {
		driver.findElement(TXTNIK).click();
		driver.findElement(TXTNIK).sendKeys(nik);
	}

	public void setEmail(String email) {
		driver.findElement(TXTEmail).click();
		driver.findElement(TXTEmail).sendKeys(email);
	}

	public void setPassword1(String password) {
		driver.findElement(TXTPassword).click();
		driver.findElement(TXTPassword).sendKeys(password);
	}

	/////////// Login //////////////////////////

	public void setNIK(String nik) {
		driver.findElement(NIKTextBox).click();
		driver.findElement(NIKTextBox).sendKeys(nik);
	}

	public void setPassword(String password) {
		driver.findElement(passwordTextBox).click();
		driver.findElement(passwordTextBox).sendKeys(password);
	}

	public void clickbtnMasuk() {
		driver.findElement(btnMasuk).click();
	}

	/////////// Ijin //////////////////////////

	public void gotoIjin() {
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button").click();
		driver.findElementByXPath("//android.view.View[@content-desc=\"DUMP MEMORY\"]").click();
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"RESET TANGGAL\"]").click();
		driver.findElement(gotoIjin).click();
	}

	public void klikDropdownKategori() {
		driver.findElementByXPath("//*[@class ='android.widget.Button' and contains(@content-desc,'Pilih')]").click();
	}

	public void listSakit() {
		driver.findElement(listSakit).click();
	}

	public void klikToggleHari() {
		driver.findElementByClassName("android.widget.Switch").click();
	}

	public void klikBtnTanggalDari() {
		driver.findElementByXPath("//*[@class ='android.widget.Button' and contains(@index,'2')]").click();
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Next month February 2022\"]").click();
	}

	public void pilihTanggalDari() {
		driver.findElement(pilihTanggalDari).click();
		driver.findElement(klikOk1).click();
	}

	public void klikBtnTanggalSampai() {
		driver.findElementByXPath("//*[@class ='android.widget.Button' and contains(@index,'3')]").click();
	}

	public void pilihTanggalSampai() {
		driver.findElement(pilihTanggalSampai).click();
		driver.findElement(klikOk2).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void klikBtnFoto() throws Exception {
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(100, 1000)).moveTo(PointOption.point(200, 200)).release().perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@class ='android.widget.Button' and contains(@index,'3')]").click();
	}

	public void klikAmbilFoto() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(ambilFoto).click();
	}

	public void klikLanjutkan() throws InterruptedException {
		Thread.sleep(3000);
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(100, 1000)).moveTo(PointOption.point(200, 200)).release().perform();
		Thread.sleep(3000);
		driver.findElement(klikLanjutkan).click();
	}

	public void klikOkAlert() {
		driver.findElement(okAlert).click();
	}

	public void listLainnya() {
		driver.findElement(listLainnya).click();
	}

	public void isiFormAlasan(String alasan) {
		driver.findElement(formAlasan).click();
		driver.findElement(formAlasan).sendKeys(alasan);
	}

	////////////////////// DASHBOARD//////////////////////
	public void gotoDashboard() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"Dashboard\"]").click();
	}

	public void klikAbsen() {
		driver.findElementByXPath("//*[@class ='android.view.View' and contains(@content-desc,'ABSEN')]").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	public void klikTelat() throws InterruptedException {
		driver.findElementByXPath("//*[@class ='android.view.View' and contains(@content-desc,'TELAT')]").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

	}

	public void klikPulangCepat() throws InterruptedException {
		driver.findElementByXPath("//*[@class ='android.view.View' and contains(@content-desc,'PULANG')]").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	public void klikLembur() {
		driver.findElementByXPath("//*[@class ='android.view.View' and contains(@content-desc,'LEMBUR')]").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	public void klikIzin() {
		driver.findElementByXPath("//*[@class ='android.view.View' and contains(@content-desc,'IZIN')]").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	public void klikCuti() {
		driver.findElementByXPath("//*[@class ='android.view.View' and contains(@content-desc,'CUTI')]").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	public void klikJumlahStaff() {
		driver.findElementByXPath("//*[@class ='android.view.View' and contains(@content-desc,'JUMLAH')]").click();
	}

	public void klikBelumAbsen() throws InterruptedException {
		driver.findElementByXPath("//*[@class ='android.view.View' and contains(@content-desc,'BELUM')]").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	/////////////////// Daftar Absensi ////////////////////

	public void goDaftarAbsensi() {
		driver.findElement(btnDaftarAbsensi).click();
	}

	public void clickListKategori() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@class ='android.view.View' and contains(@index, '1')]").click();
	}

	public void dropdownAbsen() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Absen\"]").click();
	}

	public void dropdownTelat() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Telat\"]").click();
	}

	public void dropdownPulangCepat() {
		driver.findElementByXPath("//*[@class ='android.widget.Button' and contains(@content-desc, 'Pulang')]").click();
	}

	public void dropdownLembur() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Lembur\"]").click();
	}

	public void dropdownIzin() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Izin\"]").click();
	}

	public void dropdownCuti() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Cuti\"]").click();
	}

	public void clickAbsen() {
		driver.findElement(btnAbsen).click();
	}

	public void clickTelat() {
		driver.findElement(btnTelat).click();
	}

	public void clickPulangCepat() {
		driver.findElement(btnPulangCepat).click();
	}

	public void clickLembur() {
		driver.findElement(btnLembur).click();
	}

	public void clickIzin() {
		driver.findElement(btnIzin).click();
	}

	public void clickCuti() {
		driver.findElement(btnCuti).click();
	}

	public void goPilihWaktu() {
		driver.findElement(lstPilihWaktu).click();
	}

	public void goPilihWaktuDaily() {
		driver.findElement(lstPilihWaktuDaily).click();
	}

	public void goPilihWaktuWeekly() {
		driver.findElement(lstPilihWaktuWeekly).click();
	}

	public void clickDaily() {
		driver.findElement(btnDaily).click();
	}

	public void clickWeekly() {
		driver.findElement(btnWeekly).click();
	}

	public void clickMonthly() {
		driver.findElement(btnMonthly).click();
	}

	public void goCalendar() throws InterruptedException {
		driver.findElement(btnCalendar).click();
		Thread.sleep(2000);
	}

	public void goCalendar1() throws InterruptedException {
		driver.findElement(btnCalendar1).click();
		Thread.sleep(2000);
	}

	public void clickDate() {
		driver.findElement(btnDate).click();
	}

	public void clickOK4() {
		driver.findElement(btnOK4).click();
	}

	public void dropdownBelumTerproses() {
		driver.findElementByXPath("//*[@class ='android.widget.Button' and contains(@content-desc,'Belum')]").click();
	}

	public void dropdownApproved() {
		driver.findElementByXPath("//*[@class ='android.widget.Button' and contains(@content-desc,'Approved')]")
				.click();
	}

	public void clickApproved() {
		driver.findElement(lstApproved).click();
	}

	public void clickRejected() {
		driver.findElement(lstRejected).click();
	}

	public void clickSearch() {
		driver.findElement(btnSearch).click();
	}

	public void clickRefresh4() throws InterruptedException {
		driver.findElement(btnRefresh4).click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	////////////////////// DAFTAR REQUEST///////////////////////////////
	public void goDaftarRequest() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"Daftar Request\"]").click();
	}

	public void goInfoAnggota() {
		driver.findElementByXPath("//*[@class ='android.view.View' and contains(@index,'4')]").click();
	}

	public void goDetail() {
		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"Detail\"])[1]").click();
	}

	public void goOKRequest() throws InterruptedException {
		Thread.sleep(3000);
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(100, 1500)).moveTo(PointOption.point(200, 200)).release().perform();
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"OK\"]").click();
		Thread.sleep(3000);
	}

	public void goEditRequest() {
		driver.findElementByXPath("(//android.widget.Button[@content-desc=\"Edit\"])[1]").click();
	}

	public void FotoRequest() throws IOException {
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.Button[1]")
				.click();
		driver.findElementByXPath(
				"//android.widget.LinearLayout[@content-desc=\"Gozali.jpeg, 20.49 kB, Jan 29\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")
				.click();
	}

	public void EditJumlahCuti(String cuti) {
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.EditText")
				.sendKeys(cuti);
	}

	public void btnDropdownShift() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Pilih Tipe Shift\"]").click();
	}

	public void btnDropdownShiftFullTime() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Full Time\"]").click();
	}

	public void btnDropdownShiftFDS() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"fds\"]").click();
	}

	public void btnDropdownShiftShift3() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Shift 3\"]").click();
	}

	public void btnDropdownShiftFreelance() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Freelance\"]").click();
	}

	public void btnDropdownShiftShifting() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Shifting\"]").click();
	}

	public void btnDropdownShiftShift9() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Shift 9\"]").click();
	}

	public void btnPilihShiftFullTime() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"Full Time\"]").click();
	}

	public void btnPilihShiftFDS() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"fds\"]").click();
	}

	public void btnPilihShiftShift3() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"Shift 3\"]").click();
	}

	public void btnPilihShiftFreelance() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"Freelance\"]").click();
	}

	public void btnPilihShiftShifting() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"Shifting\"]").click();
	}

	public void btnPilihShiftShift9() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"Shift 9\"]").click();
	}

	public void btnDropdownLembur() throws InterruptedException {
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(100, 1500)).moveTo(PointOption.point(200, 200)).release().perform();
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Ya\"]").click();
		Thread.sleep(3000);
	}

	public void btnPilihLembur() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"Tidak\"]").click();
	}

	public void btnPengubahData() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Request Pengubahan Data\"]").click();
	}

	public void btnOKRequest() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"OK\"]").click();
	}

	public void btnRequestData() {
		driver.findElementByXPath("//*[@class ='android.view.View' and contains(@index,'5')]").click();
	}

	public void btnDropdownAll() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"All\"]").click();
	}

	public void btnDropdownNIK() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Nik\"]").click();
	}

	public void btnDropdownNama() {
		driver.findElementByXPath("//android.widget.Button[@content-desc=\"Nama Lengkap\"]").click();
	}

	public void btnPilihNIK() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"Nik\"]").click();
	}

	public void btnPilihNama() {
		driver.findElementByXPath("//android.view.View[@content-desc=\"Nama Lengkap\"]").click();
	}

	public void TXTSearch(String search) {
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
				.sendKeys(search);
	}

	public void btnSearch() throws InterruptedException {
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText/android.widget.Button")
				.click();
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

}
