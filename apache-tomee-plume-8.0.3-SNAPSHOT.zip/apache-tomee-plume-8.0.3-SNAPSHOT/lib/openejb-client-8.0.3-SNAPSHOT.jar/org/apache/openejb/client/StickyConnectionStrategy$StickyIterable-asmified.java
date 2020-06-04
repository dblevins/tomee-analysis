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
public class StickyConnectionStrategy$StickyIterableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/client/StickyConnectionStrategy$StickyIterable", "Ljava/lang/Object;Ljava/lang/Iterable<Ljava/net/URI;>;", "java/lang/Object", new String[] { "java/lang/Iterable" });

classWriter.visitInnerClass("org/apache/openejb/client/StickyConnectionStrategy$StickyIterable", "org/apache/openejb/client/StickyConnectionStrategy", "StickyIterable", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/openejb/client/StickyConnectionStrategy$StickyIterable$StickyIterator", "org/apache/openejb/client/StickyConnectionStrategy$StickyIterable", "StickyIterator", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/openejb/client/StickyConnectionStrategy$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "cluster", "Lorg/apache/openejb/client/ClusterMetaData;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iterable", "Ljava/lang/Iterable;", "Ljava/lang/Iterable<Ljava/net/URI;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/client/StickyConnectionStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/client/StickyConnectionStrategy;Lorg/apache/openejb/client/ClusterMetaData;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/StickyConnectionStrategy$StickyIterable", "this$0", "Lorg/apache/openejb/client/StickyConnectionStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/StickyConnectionStrategy$StickyIterable", "cluster", "Lorg/apache/openejb/client/ClusterMetaData;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/StickyConnectionStrategy", "access$000", "(Lorg/apache/openejb/client/StickyConnectionStrategy;)Lorg/apache/openejb/client/AbstractConnectionStrategy;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/AbstractConnectionStrategy", "createIterable", "(Lorg/apache/openejb/client/ClusterMetaData;)Ljava/lang/Iterable;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/StickyConnectionStrategy$StickyIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/net/URI;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/StickyConnectionStrategy$StickyIterable$StickyIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/StickyConnectionStrategy$StickyIterable$StickyIterator", "<init>", "(Lorg/apache/openejb/client/StickyConnectionStrategy$StickyIterable;Lorg/apache/openejb/client/StickyConnectionStrategy$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/openejb/client/StickyConnectionStrategy$StickyIterable;)Lorg/apache/openejb/client/ClusterMetaData;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/StickyConnectionStrategy$StickyIterable", "cluster", "Lorg/apache/openejb/client/ClusterMetaData;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/openejb/client/StickyConnectionStrategy$StickyIterable;)Ljava/lang/Iterable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/StickyConnectionStrategy$StickyIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
