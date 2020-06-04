package asm.org.apache.openejb.client;
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
public class InterfaceTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/client/InterfaceType", "Ljava/lang/Enum<Lorg/apache/openejb/client/InterfaceType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_HOME", "Lorg/apache/openejb/client/InterfaceType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_OBJECT", "Lorg/apache/openejb/client/InterfaceType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_LOCAL_HOME", "Lorg/apache/openejb/client/InterfaceType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_LOCAL", "Lorg/apache/openejb/client/InterfaceType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BUSINESS_LOCAL", "Lorg/apache/openejb/client/InterfaceType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BUSINESS_LOCAL_HOME", "Lorg/apache/openejb/client/InterfaceType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BUSINESS_REMOTE", "Lorg/apache/openejb/client/InterfaceType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BUSINESS_REMOTE_HOME", "Lorg/apache/openejb/client/InterfaceType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/client/InterfaceType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/client/InterfaceType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/InterfaceType", "$VALUES", "[Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/client/InterfaceType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/client/InterfaceType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/client/InterfaceType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/client/InterfaceType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/InterfaceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_HOME");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/InterfaceType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/InterfaceType", "EJB_HOME", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/InterfaceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_OBJECT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/InterfaceType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/InterfaceType", "EJB_OBJECT", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/InterfaceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_LOCAL_HOME");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/InterfaceType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/InterfaceType", "EJB_LOCAL_HOME", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/InterfaceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_LOCAL");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/InterfaceType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/InterfaceType", "EJB_LOCAL", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/InterfaceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BUSINESS_LOCAL");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/InterfaceType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/InterfaceType", "BUSINESS_LOCAL", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/InterfaceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BUSINESS_LOCAL_HOME");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/InterfaceType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/InterfaceType", "BUSINESS_LOCAL_HOME", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/InterfaceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BUSINESS_REMOTE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/InterfaceType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/InterfaceType", "BUSINESS_REMOTE", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/InterfaceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BUSINESS_REMOTE_HOME");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/InterfaceType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/InterfaceType", "BUSINESS_REMOTE_HOME", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/client/InterfaceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/InterfaceType", "EJB_HOME", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/InterfaceType", "EJB_OBJECT", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/InterfaceType", "EJB_LOCAL_HOME", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/InterfaceType", "EJB_LOCAL", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/InterfaceType", "BUSINESS_LOCAL", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/InterfaceType", "BUSINESS_LOCAL_HOME", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/InterfaceType", "BUSINESS_REMOTE", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/InterfaceType", "BUSINESS_REMOTE_HOME", "Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/InterfaceType", "$VALUES", "[Lorg/apache/openejb/client/InterfaceType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
