package asm.org.bouncycastle.jcajce.util;
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
public class BCJcaJceHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/util/BCJcaJceHelper", null, "org/bouncycastle/jcajce/util/ProviderJcaJceHelper", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "bcProvider", "Ljava/security/Provider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNCHRONIZED, "getBouncyCastleProvider", "()Ljava/security/Provider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("BC");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/Security", "getProvider", "(Ljava/lang/String;)Ljava/security/Provider;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitLdcInsn("BC");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/Security", "getProvider", "(Ljava/lang/String;)Ljava/security/Provider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/util/BCJcaJceHelper", "bcProvider", "Ljava/security/Provider;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/util/BCJcaJceHelper", "bcProvider", "Ljava/security/Provider;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jce/provider/BouncyCastleProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/provider/BouncyCastleProvider", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/util/BCJcaJceHelper", "bcProvider", "Ljava/security/Provider;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/util/BCJcaJceHelper", "bcProvider", "Ljava/security/Provider;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/util/BCJcaJceHelper", "getBouncyCastleProvider", "()Ljava/security/Provider;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/util/ProviderJcaJceHelper", "<init>", "(Ljava/security/Provider;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
