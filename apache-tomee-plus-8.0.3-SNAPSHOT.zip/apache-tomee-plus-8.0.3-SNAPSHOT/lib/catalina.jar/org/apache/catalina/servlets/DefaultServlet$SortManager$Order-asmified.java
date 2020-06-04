package asm.org.apache.catalina.servlets;
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
public class DefaultServlet$SortManager$OrderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/catalina/servlets/DefaultServlet$SortManager", "org/apache/catalina/servlets/DefaultServlet", "SortManager", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "org/apache/catalina/servlets/DefaultServlet$SortManager", "Order", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "column", "C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "ascending", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAME", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAME_ASC", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIZE", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIZE_ASC", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAST_MODIFIED", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAST_MODIFIED_ASC", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(CZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "column", "C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "ascending", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 78);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "<init>", "(CZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "NAME", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 78);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "<init>", "(CZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "NAME_ASC", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "<init>", "(CZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "SIZE", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "<init>", "(CZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "SIZE_ASC", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 77);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "<init>", "(CZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "LAST_MODIFIED", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 77);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "<init>", "(CZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "LAST_MODIFIED_ASC", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "NAME", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/servlets/DefaultServlet$SortManager$Order", "DEFAULT", "Lorg/apache/catalina/servlets/DefaultServlet$SortManager$Order;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
