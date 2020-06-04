package asm.javax.faces.webapp;
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
public class FacesServlet$HttpMethodDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/faces/webapp/FacesServlet$HttpMethod", "Ljava/lang/Enum<Ljavax/faces/webapp/FacesServlet$HttpMethod;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/faces/webapp/FacesServlet$HttpMethod", "javax/faces/webapp/FacesServlet", "HttpMethod", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPTIONS", "Ljavax/faces/webapp/FacesServlet$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GET", "Ljavax/faces/webapp/FacesServlet$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEAD", "Ljavax/faces/webapp/FacesServlet$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST", "Ljavax/faces/webapp/FacesServlet$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PUT", "Ljavax/faces/webapp/FacesServlet$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DELETE", "Ljavax/faces/webapp/FacesServlet$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRACE", "Ljavax/faces/webapp/FacesServlet$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONNECT", "Ljavax/faces/webapp/FacesServlet$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/faces/webapp/FacesServlet$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/faces/webapp/FacesServlet$HttpMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "$VALUES", "[Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/faces/webapp/FacesServlet$HttpMethod;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/faces/webapp/FacesServlet$HttpMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/webapp/FacesServlet$HttpMethod;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/webapp/FacesServlet$HttpMethod");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/webapp/FacesServlet$HttpMethod", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/webapp/FacesServlet$HttpMethod", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/faces/webapp/FacesServlet$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPTIONS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("OPTIONS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/webapp/FacesServlet$HttpMethod", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "OPTIONS", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/webapp/FacesServlet$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GET");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("GET");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/webapp/FacesServlet$HttpMethod", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "GET", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/webapp/FacesServlet$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEAD");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("HEAD");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/webapp/FacesServlet$HttpMethod", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "HEAD", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/webapp/FacesServlet$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/webapp/FacesServlet$HttpMethod", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "POST", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/webapp/FacesServlet$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PUT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("PUT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/webapp/FacesServlet$HttpMethod", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "PUT", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/webapp/FacesServlet$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DELETE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("DELETE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/webapp/FacesServlet$HttpMethod", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "DELETE", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/webapp/FacesServlet$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/webapp/FacesServlet$HttpMethod", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "TRACE", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/webapp/FacesServlet$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONNECT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("CONNECT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/webapp/FacesServlet$HttpMethod", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "CONNECT", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/faces/webapp/FacesServlet$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "OPTIONS", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "GET", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "HEAD", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "POST", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "PUT", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "DELETE", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "TRACE", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "CONNECT", "Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/webapp/FacesServlet$HttpMethod", "$VALUES", "[Ljavax/faces/webapp/FacesServlet$HttpMethod;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
