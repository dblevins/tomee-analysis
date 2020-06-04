package asm.org.apache.cxf.rs.security.jose.jwk;
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
public class KeyOperationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "Ljava/lang/Enum<Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SIGN", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VERIFY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENCRYPT", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DECRYPT", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRAPKEY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNWRAPKEY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DERIVEKEY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DERIVEBITS", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "oper", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "$VALUES", "[Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/rs/security/jose/jwk/KeyOperation");
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "oper", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getKeyOperation", "(Ljava/lang/String;)Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toUpperCase", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "oper", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwk/KeyOperation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SIGN");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("sign");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "SIGN", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwk/KeyOperation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VERIFY");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("verify");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "VERIFY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwk/KeyOperation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENCRYPT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("encrypt");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "ENCRYPT", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwk/KeyOperation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DECRYPT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("decrypt");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "DECRYPT", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwk/KeyOperation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRAPKEY");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("wrapKey");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "WRAPKEY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwk/KeyOperation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNWRAPKEY");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("unwrapKey");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "UNWRAPKEY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwk/KeyOperation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DERIVEKEY");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("deriveKey");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "DERIVEKEY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwk/KeyOperation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DERIVEBITS");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("deriveBits");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "DERIVEBITS", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/rs/security/jose/jwk/KeyOperation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "SIGN", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "VERIFY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "ENCRYPT", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "DECRYPT", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "WRAPKEY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "UNWRAPKEY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "DERIVEKEY", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "DERIVEBITS", "Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwk/KeyOperation", "$VALUES", "[Lorg/apache/cxf/rs/security/jose/jwk/KeyOperation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
