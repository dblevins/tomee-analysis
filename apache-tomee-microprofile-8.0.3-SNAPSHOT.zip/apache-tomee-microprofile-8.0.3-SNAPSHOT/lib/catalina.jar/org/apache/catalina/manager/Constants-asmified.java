package asm.org.apache.catalina.manager;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class ConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/manager/Constants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Package", "Ljava/lang/String;", null, "org.apache.catalina.manager");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REL_EXTERNAL", "Ljava/lang/String;", null, "rel=\"noopener noreferrer\"");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTML_HEADER_SECTION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BODY_HEADER_SECTION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_SECTION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGER_SECTION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVER_HEADER_SECTION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVER_ROW_SECTION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTML_TAIL_SECTION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARSET", "Ljava/lang/String;", null, "utf-8");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_DECLARATION", "Ljava/lang/String;", null, "<?xml version=\"1.0\" encoding=\"utf-8\"?>");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_STYLE", "Ljava/lang/String;", null, "<?xml-stylesheet type=\"text/xsl\" href=\"{0}/xform.xsl\" ?>\n");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("<html>\n<head>\n<style>\nbody {font-family:Tahoma,Arial,sans-serif;} h1, h2, h3, b {color:white;background-color:#525D76;} h1 {font-size:22px;} h2 {font-size:16px;} h3 {font-size:14px;} p {font-size:12px;} a {color:black;} .line {height:1px;background-color:#525D76;border:none;}\n  table {\n    width: 100%;\n  }\n  td.page-title {\n    text-align: center;\n    vertical-align: top;\n    font-family:sans-serif,Tahoma,Arial;\n    font-weight: bold;\n    background: white;\n    color: black;\n  }\n  td.title {\n    text-align: left;\n    vertical-align: top;\n    font-family:sans-serif,Tahoma,Arial;\n    font-style:italic;\n    font-weight: bold;\n    background: #D2A41C;\n  }\n  td.header-left {\n    text-align: left;\n    vertical-align: top;\n    font-family:sans-serif,Tahoma,Arial;\n    font-weight: bold;\n    background: #FFDC75;\n  }\n  td.header-center {\n    text-align: center;\n    vertical-align: top;\n    font-family:sans-serif,Tahoma,Arial;\n    font-weight: bold;\n    background: #FFDC75;\n  }\n  td.row-left {\n    text-align: left;\n    vertical-align: middle;\n    font-family:sans-serif,Tahoma,Arial;\n    color: black;\n  }\n  td.row-center {\n    text-align: center;\n    vertical-align: middle;\n    font-family:sans-serif,Tahoma,Arial;\n    color: black;\n  }\n  td.row-right {\n    text-align: right;\n    vertical-align: middle;\n    font-family:sans-serif,Tahoma,Arial;\n    color: black;\n  }\n  TH {\n    text-align: center;\n    vertical-align: top;\n    font-family:sans-serif,Tahoma,Arial;\n    font-weight: bold;\n    background: #FFDC75;\n  }\n  TD {\n    text-align: center;\n    vertical-align: middle;\n    font-family:sans-serif,Tahoma,Arial;\n    color: black;\n  }\n  form {\n    margin: 1;\n  }\n  form.inline {\n    display: inline;\n  }\n</style>\n");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/manager/Constants", "HTML_HEADER_SECTION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("<title>{0}</title>\n</head>\n\n<body bgcolor=\"#FFFFFF\">\n\n<table cellspacing=\"4\" border=\"0\">\n <tr>\n  <td colspan=\"2\">\n   <a href=\"https://tomcat.apache.org/\" rel=\"noopener noreferrer\">\n    <img border=\"0\" alt=\"The Tomcat Servlet/JSP Container\"\n         align=\"left\" src=\"{0}/images/tomcat.gif\">\n   </a>\n   <a href=\"https://www.apache.org/\" rel=\"noopener noreferrer\">\n    <img border=\"0\" alt=\"The Apache Software Foundation\" align=\"right\"\n         src=\"{0}/images/asf-logo.svg\" style=\"width: 266px; height: 83px;\">\n   </a>\n  </td>\n </tr>\n</table>\n<hr size=\"1\" noshade=\"noshade\">\n<table cellspacing=\"4\" border=\"0\">\n <tr>\n  <td class=\"page-title\" bordercolor=\"#000000\" align=\"left\" nowrap>\n   <font size=\"+2\">{1}</font>\n  </td>\n </tr>\n</table>\n<br>\n\n");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/manager/Constants", "BODY_HEADER_SECTION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("<table border=\"1\" cellspacing=\"0\" cellpadding=\"3\">\n <tr>\n  <td class=\"row-left\" width=\"10%\"><small><strong>{0}</strong></small>&nbsp;</td>\n  <td class=\"row-left\"><pre>{1}</pre></td>\n </tr>\n</table>\n<br>\n\n");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/manager/Constants", "MESSAGE_SECTION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("<table border=\"1\" cellspacing=\"0\" cellpadding=\"3\">\n<tr>\n <td colspan=\"4\" class=\"title\">{0}</td>\n</tr>\n <tr>\n  <td class=\"row-left\"><a href=\"{1}\">{2}</a></td>\n  <td class=\"row-center\"><a href=\"{3}\" rel=\"noopener noreferrer\">{4}</a></td>\n  <td class=\"row-center\"><a href=\"{5}\" rel=\"noopener noreferrer\">{6}</a></td>\n  <td class=\"row-right\"><a href=\"{7}\">{8}</a></td>\n </tr>\n</table>\n<br>\n\n");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/manager/Constants", "MANAGER_SECTION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("<table border=\"1\" cellspacing=\"0\" cellpadding=\"3\">\n<tr>\n <td colspan=\"8\" class=\"title\">{0}</td>\n</tr>\n<tr>\n <td class=\"header-center\"><small>{1}</small></td>\n <td class=\"header-center\"><small>{2}</small></td>\n <td class=\"header-center\"><small>{3}</small></td>\n <td class=\"header-center\"><small>{4}</small></td>\n <td class=\"header-center\"><small>{5}</small></td>\n <td class=\"header-center\"><small>{6}</small></td>\n <td class=\"header-center\"><small>{7}</small></td>\n <td class=\"header-center\"><small>{8}</small></td>\n</tr>\n");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/manager/Constants", "SERVER_HEADER_SECTION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("<tr>\n <td class=\"row-center\"><small>{0}</small></td>\n <td class=\"row-center\"><small>{1}</small></td>\n <td class=\"row-center\"><small>{2}</small></td>\n <td class=\"row-center\"><small>{3}</small></td>\n <td class=\"row-center\"><small>{4}</small></td>\n <td class=\"row-center\"><small>{5}</small></td>\n <td class=\"row-center\"><small>{6}</small></td>\n <td class=\"row-center\"><small>{7}</small></td>\n</tr>\n</table>\n<br>\n\n");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/manager/Constants", "SERVER_ROW_SECTION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("<hr size=\"1\" noshade=\"noshade\">\n<center><font size=\"-1\" color=\"#525D76\">\n <em>Copyright &copy; 1999-2020, Apache Software Foundation</em></font></center>\n\n</body>\n</html>");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/manager/Constants", "HTML_TAIL_SECTION", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
