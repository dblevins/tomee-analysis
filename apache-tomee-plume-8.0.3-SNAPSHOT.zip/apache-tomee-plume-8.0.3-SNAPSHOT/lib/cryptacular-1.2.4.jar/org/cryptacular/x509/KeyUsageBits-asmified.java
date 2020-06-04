package asm.org.cryptacular.x509;
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
public class KeyUsageBitsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/cryptacular/x509/KeyUsageBits", "Ljava/lang/Enum<Lorg/cryptacular/x509/KeyUsageBits;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DigitalSignature", "Lorg/cryptacular/x509/KeyUsageBits;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NonRepudiation", "Lorg/cryptacular/x509/KeyUsageBits;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KeyEncipherment", "Lorg/cryptacular/x509/KeyUsageBits;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DataEncipherment", "Lorg/cryptacular/x509/KeyUsageBits;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KeyAgreement", "Lorg/cryptacular/x509/KeyUsageBits;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KeyCertSign", "Lorg/cryptacular/x509/KeyUsageBits;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CRLSign", "Lorg/cryptacular/x509/KeyUsageBits;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EncipherOnly", "Lorg/cryptacular/x509/KeyUsageBits;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DecipherOnly", "Lorg/cryptacular/x509/KeyUsageBits;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "offset", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/cryptacular/x509/KeyUsageBits;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/cryptacular/x509/KeyUsageBits;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/KeyUsageBits", "$VALUES", "[Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/cryptacular/x509/KeyUsageBits;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/cryptacular/x509/KeyUsageBits;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/cryptacular/x509/KeyUsageBits;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/cryptacular/x509/KeyUsageBits");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;II)V", "(I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/x509/KeyUsageBits", "offset", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMask", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/x509/KeyUsageBits", "offset", "I");
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSet", "(Lorg/bouncycastle/asn1/x509/KeyUsage;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/KeyUsage", "getBytes", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/x509/KeyUsageBits", "isSet", "([B)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSet", "([B)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/BitSet", "valueOf", "([B)Ljava/util/BitSet;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/x509/KeyUsageBits", "offset", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "get", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSet", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/x509/KeyUsageBits", "getMask", "()I", false);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/x509/KeyUsageBits", "offset", "I");
methodVisitor.visitInsn(ISHR);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "usage", "([Lorg/cryptacular/x509/KeyUsageBits;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"[Lorg/cryptacular/x509/KeyUsageBits;", Opcodes.INTEGER, "[Lorg/cryptacular/x509/KeyUsageBits;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/x509/KeyUsageBits", "getMask", "()I", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/KeyUsageBits");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DigitalSignature");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/KeyUsageBits", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/KeyUsageBits", "DigitalSignature", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/KeyUsageBits");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NonRepudiation");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/KeyUsageBits", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/KeyUsageBits", "NonRepudiation", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/KeyUsageBits");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyEncipherment");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/KeyUsageBits", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/KeyUsageBits", "KeyEncipherment", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/KeyUsageBits");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DataEncipherment");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/KeyUsageBits", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/KeyUsageBits", "DataEncipherment", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/KeyUsageBits");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyAgreement");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/KeyUsageBits", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/KeyUsageBits", "KeyAgreement", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/KeyUsageBits");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyCertSign");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/KeyUsageBits", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/KeyUsageBits", "KeyCertSign", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/KeyUsageBits");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CRLSign");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/KeyUsageBits", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/KeyUsageBits", "CRLSign", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/KeyUsageBits");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EncipherOnly");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/KeyUsageBits", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/KeyUsageBits", "EncipherOnly", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/KeyUsageBits");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DecipherOnly");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/KeyUsageBits", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/KeyUsageBits", "DecipherOnly", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/cryptacular/x509/KeyUsageBits");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/KeyUsageBits", "DigitalSignature", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/KeyUsageBits", "NonRepudiation", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/KeyUsageBits", "KeyEncipherment", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/KeyUsageBits", "DataEncipherment", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/KeyUsageBits", "KeyAgreement", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/KeyUsageBits", "KeyCertSign", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/KeyUsageBits", "CRLSign", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/KeyUsageBits", "EncipherOnly", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/KeyUsageBits", "DecipherOnly", "Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/KeyUsageBits", "$VALUES", "[Lorg/cryptacular/x509/KeyUsageBits;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
