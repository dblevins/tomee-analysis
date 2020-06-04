package asm.org.apache.openejb.assembler.classic;
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
public class JndiBuilder$JndiNameStrategy$InterfaceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "Ljava/lang/Enum<Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy", "org/apache/openejb/assembler/classic/JndiBuilder", "JndiNameStrategy", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy", "Interface", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REMOTE_HOME", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOCAL_HOME", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BUSINESS_LOCAL", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOCALBEAN", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BUSINESS_REMOTE", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVICE_ENDPOINT", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "type", "Lorg/apache/openejb/InterfaceType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotatedName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "xmlName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "xmlNameCc", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "openejbLegacy", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "$VALUES", "[Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILorg/apache/openejb/InterfaceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Lorg/apache/openejb/InterfaceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "type", "Lorg/apache/openejb/InterfaceType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "annotatedName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "xmlName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Strings", "camelCase", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "xmlNameCc", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "openejbLegacy", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Lorg/apache/openejb/InterfaceType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "type", "Lorg/apache/openejb/InterfaceType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotationName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "annotatedName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "xmlName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlNameCc", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "xmlNameCc", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOpenejbLegacy", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "openejbLegacy", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REMOTE_HOME");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/InterfaceType", "EJB_HOME", "Lorg/apache/openejb/InterfaceType;");
methodVisitor.visitLdcInsn("RemoteHome");
methodVisitor.visitLdcInsn("home");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "<init>", "(Ljava/lang/String;ILorg/apache/openejb/InterfaceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "REMOTE_HOME", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOCAL_HOME");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/InterfaceType", "EJB_LOCAL_HOME", "Lorg/apache/openejb/InterfaceType;");
methodVisitor.visitLdcInsn("LocalHome");
methodVisitor.visitLdcInsn("local-home");
methodVisitor.visitLdcInsn("Local");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "<init>", "(Ljava/lang/String;ILorg/apache/openejb/InterfaceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "LOCAL_HOME", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BUSINESS_LOCAL");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/InterfaceType", "BUSINESS_LOCAL", "Lorg/apache/openejb/InterfaceType;");
methodVisitor.visitLdcInsn("Local");
methodVisitor.visitLdcInsn("business-local");
methodVisitor.visitLdcInsn("BusinessLocal");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "<init>", "(Ljava/lang/String;ILorg/apache/openejb/InterfaceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "BUSINESS_LOCAL", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOCALBEAN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/InterfaceType", "LOCALBEAN", "Lorg/apache/openejb/InterfaceType;");
methodVisitor.visitLdcInsn("LocalBean");
methodVisitor.visitLdcInsn("localbean");
methodVisitor.visitLdcInsn("LocalBean");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "<init>", "(Ljava/lang/String;ILorg/apache/openejb/InterfaceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "LOCALBEAN", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BUSINESS_REMOTE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/InterfaceType", "BUSINESS_REMOTE", "Lorg/apache/openejb/InterfaceType;");
methodVisitor.visitLdcInsn("Remote");
methodVisitor.visitLdcInsn("business-remote");
methodVisitor.visitLdcInsn("BusinessRemote");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "<init>", "(Ljava/lang/String;ILorg/apache/openejb/InterfaceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "BUSINESS_REMOTE", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVICE_ENDPOINT");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/InterfaceType", "SERVICE_ENDPOINT", "Lorg/apache/openejb/InterfaceType;");
methodVisitor.visitLdcInsn("Endpoint");
methodVisitor.visitLdcInsn("service-endpoint");
methodVisitor.visitLdcInsn("ServiceEndpoint");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "<init>", "(Ljava/lang/String;ILorg/apache/openejb/InterfaceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "SERVICE_ENDPOINT", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "REMOTE_HOME", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "LOCAL_HOME", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "BUSINESS_LOCAL", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "LOCALBEAN", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "BUSINESS_REMOTE", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "SERVICE_ENDPOINT", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "$VALUES", "[Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
