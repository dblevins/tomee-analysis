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
public class DSTU7624Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$AlgParamGen", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "AlgParamGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$AlgParamGen128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "AlgParamGen128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$AlgParamGen256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "AlgParamGen256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$AlgParamGen512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "AlgParamGen512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$AlgParams", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "AlgParams", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CBC128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CBC128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CBC256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CBC256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CBC512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CBC512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CCM128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CCM128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CCM256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CCM256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CCM512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CCM512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CFB128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CFB128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CFB256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CFB256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CFB512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CFB512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CTR128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CTR128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CTR256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CTR256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$CTR512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "CTR512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$ECB", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "ECB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$ECB128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "ECB128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$ECB256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "ECB256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$ECB512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "ECB512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$ECB_128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "ECB_128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$ECB_256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "ECB_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$ECB_512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "ECB_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$GCM128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "GCM128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$GCM256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "GCM256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$GCM512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "GCM512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$GMAC", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "GMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$GMAC128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "GMAC128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$GMAC256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "GMAC256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$GMAC512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "GMAC512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$KeyGen", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "KeyGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$KeyGen128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "KeyGen128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$KeyGen256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "KeyGen256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$KeyGen512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "KeyGen512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$Mappings", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "Mappings", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$OFB128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "OFB128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$OFB256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "OFB256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$OFB512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "OFB512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$Wrap", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "Wrap", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$Wrap128", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "Wrap128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$Wrap256", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "Wrap256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$Wrap512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "Wrap512", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
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
