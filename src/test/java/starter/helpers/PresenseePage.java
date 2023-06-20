package starter.helpers;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://presencee.netlify.app/")
class PresenseePage extends PageObject {
    public static Target Click_Home = Target.the("Home Button").locatedBy("//*[@id=\"root\"]/div/div/div/nav/div/ul/li[1]");
    public static Target Click_Feature = Target.the("Feature Button").locatedBy("//*[@id=\"root\"]/div/div/div/nav/div/ul/li[2]");
    public static Target Click_Feature_Presensi_Sidik_Jari = Target.the("Presensi sidik jari Button").locatedBy("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div[1]");
    public static Target Click_Feature_Jadwal = Target.the("Jadwal Button").locatedBy("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div[2]");
    public static Target Click_Feature_Histori_Presensi = Target.the("Histori Presensi Button").locatedBy("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div[3]");
    public static Target Click_Feature_Presensi_Kamera = Target.the("Presensi Kamera Button").locatedBy("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div[4]");
    public static Target On_Faq_page = Target.the("F.A.Q Page").locatedBy("//*[@id=\"root\"]/div/div/div/div[4]");
    public static Target On_Faq_page_1 = Target.the("F.A.Q Page 1").locatedBy("//*[@id=\"root\"]/div/div/div/div[4]/div/div/div[1]");
    public static Target On_Faq_page_2 = Target.the("F.A.Q Page 2").locatedBy("//*[@id=\"root\"]/div/div/div/div[4]/div/div/div[2]");
    public static Target On_Faq_page_3 = Target.the("F.A.Q Page 3").locatedBy("//*[@id=\"root\"]/div/div/div/div[4]/div/div/div[3]");
    public static Target On_Faq_page_4 = Target.the("F.A.Q Page 4").locatedBy("//*[@id=\"root\"]/div/div/div/div[4]/div/div/div[4]");
    public static Target On_Help_Page = Target.the("Help Page").locatedBy("//*[@id=\"root\"]/div/div/div/nav/div/ul/li[3]/span/a");
    public static Target Click_Contact_Us = Target.the("Contact Us").locatedBy("//*[@id=\"contact\"]/div[1]/button/span");
    public static Target Click_About_Us = Target.the("About Us").locatedBy("//*[@id=\"root\"]/div/div/div/nav/div/ul/li[4]/span/a");
    public static Target Click_Portal = Target.the("Portal").locatedBy("//*[@id=\"root\"]/div/div/div/nav/div/button[1]");
    public static Target Click_Portal_Admin = Target.the("Portal Admin").locatedBy("/html/body/div[2]/div/ul/li[1]/span/a");
    public static Target on_Portal_Admin = Target.the("Portal Admin Page").locatedBy("//*[@id=\"root\"]/div/div/div/div[3]");
    public static Target Click_Portal_Dosen = Target.the("Portal Dosen").locatedBy("/html/body/div[2]/div/ul/li[3]/span/a");
    public static Target on_Portal_Dosen = Target.the("Portal Dosen Page").locatedBy("//*[@id=\"root\"]/div/div/div/div[3]");
    public static Target Email_Field = Target.the("Email Field").locatedBy("//*[@id=\"login-form_email\"]");
    public static Target Password_Field = Target.the("Password Field").locatedBy("//*[@id=\"login-form_password\"]");
    public static Target Click_Enter = Target.the("Enter Button").locatedBy("//*[@id=\"login-form\"]/div[4]/div/div/div/div/button");
    public static Target on_Admin_Page_Dashboard = Target.the("Admin Page Dashboard").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main");
    public static Target Visible_Password = Target.the("Eyes").locatedBy("//*[@id=\"login-form\"]/div[2]/div[1]/div/div[1]/div/span/span/span");
    public static Target Filling_Email_Field = Target.the("Fill Email Page").locatedBy("//*[@id=\"login-form_email\"]");
    public static Target Filling_Password_Field = Target.the("Fill Password Page").locatedBy("//*[@id=\"login-form_password\"]");
    public static Target Click_Login = Target.the("Login Button").locatedBy("//*[@id=\"login-form\"]/div[5]/div/div/div/div/button");
    public static Target on_Dosen_Page_Dashboard = Target.the("Dosen Page Dashboard").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main");
    public static Target on_Jadwal_Kuliah = Target.the("Jadwal Kuliah Page").locatedBy("//*[@id=\"root\"]/div/div/div/section/aside/div/ul/li[2]");
    public static Target Click_On_Tambahkan = Target.the("Tambahkan Button").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/a/button");
    public static Target Click_On_Data_Mahasiswa = Target.the("Data Mahasiswa Page").locatedBy("//*[@id=\"root\"]/div/div/div/section/aside/div/ul/li[3]");
    public static Target Choose_On_Data_Mahasiswa = Target.the("Choose Data Mahasiswa").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[2]/a");
    public static Target Click_On_Right_Sign = Target.the("Right Sign").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[3]/ul/li[6]");
    public static Target Click_On_Next_Sign = Target.the("Next Sign").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[3]/ul/li[6]");
    public static Target Click_On_Third_Sign = Target.the("Third Sign").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[3]/ul/li[6]");
    public static Target Click_On_Last_Sign = Target.the("Last Sign").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[3]/ul/li[6]");
    public static Target Search_Nama_Mahasiswa = Target.the("Search Column").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[2]/table/thead/tr[1]/th[4]/span/span/span[1]");
    public static Target Filling_Nama_Mahasiswa_Field = Target.the("Fill Nama Mahasiswa Page").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[2]/table/thead/tr[1]/th[4]/span/span/span[1]/input");
    public static Target Click_Detail_Button = Target.the("Detail Button").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[2]/table/tbody/tr[1]/td[4]/button");
    public static Target Kembali_Button = Target.the("Kembali Button").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[4]/a[1]/button");
    public static Target Choose_On_Data_Dosen = Target.the("Choose Data Dosen").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[3]/a");
    public static Target Choose_On_First_Sign = Target.the("First Sign").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[3]/ul/li[5]");
    public static Target Choose_On_Second_Sign = Target.the("Second Sign").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[3]/ul/li[5]");
    public static Target Search_Nama_Dosen = Target.the("Search Column").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[2]/table/thead/tr/th[3]/span/span/span[1]");
    public static Target Filling_Nama_Dosen_Field = Target.the("Fill Nama Dosen Page").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[2]/table/thead/tr/th[3]/span/span/span[1]/input");
    public static Target Click_Detail_Button_From_Dosen_List = Target.the("Detail Button From Dosen List").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[2]/table/tbody/tr[4]/td[3]/a/button");
    public static Target See_Detail_Of_Dosen = Target.the("See Detail Of Dosen").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main");
    public static Target Back_Button= Target.the("Back Button").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/main/div/div[4]/a[1]/button");
    public static Target Riwayat_Presensi= Target.the("Riwayat Presensi").locatedBy("//*[@id=\"root\"]/div/div/div/section/aside/div/ul/li[4]");
    public static Target Click_Log_Out= Target.the("Log Out from portal admin").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/header/div[2]/a/button");
    public static Target Click_Jadwal_Kuliah= Target.the("Jadwal Kuliah for Lecturing").locatedBy("//*[@id=\"root\"]/div/div/div/section/aside/div/ul/li[2]");
    public static Target Click_Logout_From_Dosen_Page= Target.the("Logout from dosen dashboard").locatedBy("//*[@id=\"root\"]/div/div/div/section/section/header/div[2]/a/button");
}
