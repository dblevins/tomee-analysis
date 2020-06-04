package asm.org.apache.xml.security.keys.storage.implementations;
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
public class KeyStoreResolver$KeyStoreIterator$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/xml/security/keys/storage/implementations/KeyStoreResolver$KeyStoreIterator$1", "Ljava/lang/Object;Ljava/util/Enumeration<Ljava/lang/String;>;", "java/lang/Object", new String[] { "java/util/Enumeration" });

classWriter.visitOuterClass("org/apache/xml/security/keys/storage/implementations/KeyStoreResolver$KeyStoreIterator", "<init>", "(Ljava/security/KeyStore;)V");

classWriter.visitInnerClass("org/apache/xml/security/keys/storage/implementations/KeyStoreResolver$KeyStoreIterator", "org/apache/xml/security/keys/storage/implementations/KeyStoreResolver", "KeyStoreIterator", ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/keys/storage/implementations/KeyStoreResolver$KeyStoreIterator$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/xml/security/keys/storage/implementations/KeyStoreResolver$KeyStoreIterator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/xml/security/keys/storage/implementations/KeyStoreResolver$KeyStoreIterator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/keys/storage/implementations/KeyStoreResolver$KeyStoreIterator$1", "this$0", "Lorg/apache/xml/security/keys/storage/implementations/KeyStoreResolver$KeyStoreIterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasMoreElements", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextElement", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "nextElement", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/keys/storage/implementations/KeyStoreResolver$KeyStoreIterator$1", "nextElement", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
