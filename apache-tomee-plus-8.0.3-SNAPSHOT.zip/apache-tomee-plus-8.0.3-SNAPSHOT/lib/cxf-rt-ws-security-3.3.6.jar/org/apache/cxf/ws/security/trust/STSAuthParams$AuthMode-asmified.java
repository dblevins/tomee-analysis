package asm.org.apache.cxf.ws.security.trust;
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
public class STSAuthParams$AuthModeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "Ljava/lang/Enum<Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "org/apache/cxf/ws/security/trust/STSAuthParams", "AuthMode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "X509_ASSYMETRIC", "Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UT_TRANSPORT", "Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UT_SYMMETRIC", "Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "endpointName", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "keyType", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "$VALUES", "[Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;Ljava/lang/String;)V", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "endpointName", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "keyType", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEndpointName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "endpointName", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeyType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "keyType", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X509_ASSYMETRIC");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/security/trust/STSAuthParams", "access$000", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512/PublicKey");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "X509_ASSYMETRIC", "Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UT_TRANSPORT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/security/trust/STSAuthParams", "access$100", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "UT_TRANSPORT", "Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UT_SYMMETRIC");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/security/trust/STSAuthParams", "access$200", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "UT_SYMMETRIC", "Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "X509_ASSYMETRIC", "Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "UT_TRANSPORT", "Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "UT_SYMMETRIC", "Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/trust/STSAuthParams$AuthMode", "$VALUES", "[Lorg/apache/cxf/ws/security/trust/STSAuthParams$AuthMode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
