package asm.org.bouncycastle.jcajce.provider.symmetric;
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
public class DESede$PBEWithSHAAndDES3KeyFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/DESede$PBEWithSHAAndDES3KeyFactory", null, "org/bouncycastle/jcajce/provider/symmetric/DES$DESPBEKeyFactory", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$DESPBEKeyFactory", "org/bouncycastle/jcajce/provider/symmetric/DES", "DESPBEKeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$PBEWithSHAAndDES3KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/DESede", "PBEWithSHAAndDES3KeyFactory", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PBEwithSHAandDES3Key-CBC");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "pbeWithSHAAnd3_KeyTripleDES_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/symmetric/DES$DESPBEKeyFactory", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;ZIIII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
