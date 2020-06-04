package asm.org.apache.wss4j.dom.engine;
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
public class WSSConfig$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/dom/engine/WSSConfig$2", "Ljava/lang/Object;Ljava/security/PrivilegedAction<Ljava/lang/Boolean;>;", "java/lang/Object", new String[] { "java/security/PrivilegedAction" });

classWriter.visitOuterClass("org/apache/wss4j/dom/engine/WSSConfig", "init", "()V");

classWriter.visitInnerClass("org/apache/wss4j/dom/engine/WSSConfig$2", null, null, 0);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("STRTransform");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/Security", "removeProvider", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("STRTransform");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/transform/STRTransformProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/transform/STRTransformProvider", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/crypto/WSProviderConfig", "appendJceProvider", "(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("AttachmentContentSignatureTransform");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/Security", "removeProvider", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("AttachmentContentSignatureTransform");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/transform/AttachmentContentSignatureTransformProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/transform/AttachmentContentSignatureTransformProvider", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/crypto/WSProviderConfig", "appendJceProvider", "(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("AttachmentCompleteSignatureTransform");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/Security", "removeProvider", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("AttachmentCompleteSignatureTransform");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/transform/AttachmentCompleteSignatureTransformProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/transform/AttachmentCompleteSignatureTransformProvider", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/crypto/WSProviderConfig", "appendJceProvider", "(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/engine/WSSConfig$2", "run", "()Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
