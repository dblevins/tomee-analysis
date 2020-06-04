package asm.org.apache.catalina.manager.host;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/manager/host/Constants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Package", "Ljava/lang/String;", null, "org.apache.catalina.manager.host");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REL_EXTERNAL", "Ljava/lang/String;", null, "rel=\"noopener noreferrer\"");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_SECTION", "Ljava/lang/String;", null, "<table border=\"1\" cellspacing=\"0\" cellpadding=\"3\">\n <tr>\n  <td class=\"row-left\" width=\"10%\"><small><strong>{0}</strong></small>&nbsp;</td>\n  <td class=\"row-left\"><pre>{1}</pre></td>\n </tr>\n</table>\n<br>\n\n");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGER_SECTION", "Ljava/lang/String;", null, "<table border=\"1\" cellspacing=\"0\" cellpadding=\"3\">\n<tr>\n <td colspan=\"4\" class=\"title\">{0}</td>\n</tr>\n <tr>\n  <td class=\"row-left\"><a href=\"{1}\">{2}</a></td>\n  <td class=\"row-center\"><a href=\"{3}\" rel=\"noopener noreferrer\">{4}</a></td>\n  <td class=\"row-center\"><a href=\"{5}\" rel=\"noopener noreferrer\">{6}</a></td>\n  <td class=\"row-right\"><a href=\"{7}\">{8}</a></td>\n </tr>\n</table>\n<br>\n\n");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVER_HEADER_SECTION", "Ljava/lang/String;", null, "<table border=\"1\" cellspacing=\"0\" cellpadding=\"3\">\n<tr>\n <td colspan=\"6\" class=\"title\">{0}</td>\n</tr>\n<tr>\n <td class=\"header-center\"><small>{1}</small></td>\n <td class=\"header-center\"><small>{2}</small></td>\n <td class=\"header-center\"><small>{3}</small></td>\n <td class=\"header-center\"><small>{4}</small></td>\n <td class=\"header-center\"><small>{5}</small></td>\n <td class=\"header-center\"><small>{6}</small></td>\n</tr>\n");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVER_ROW_SECTION", "Ljava/lang/String;", null, "<tr>\n <td class=\"row-center\"><small>{0}</small></td>\n <td class=\"row-center\"><small>{1}</small></td>\n <td class=\"row-center\"><small>{2}</small></td>\n <td class=\"row-center\"><small>{3}</small></td>\n <td class=\"row-center\"><small>{4}</small></td>\n <td class=\"row-center\"><small>{5}</small></td>\n</tr>\n</table>\n<br>\n\n");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTML_TAIL_SECTION", "Ljava/lang/String;", null, "<hr size=\"1\" noshade=\"noshade\">\n<center><font size=\"-1\" color=\"#525D76\">\n <em>Copyright &copy; 1999-2020, Apache Software Foundation</em></font></center>\n\n</body>\n</html>");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARSET", "Ljava/lang/String;", null, "utf-8");
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
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
