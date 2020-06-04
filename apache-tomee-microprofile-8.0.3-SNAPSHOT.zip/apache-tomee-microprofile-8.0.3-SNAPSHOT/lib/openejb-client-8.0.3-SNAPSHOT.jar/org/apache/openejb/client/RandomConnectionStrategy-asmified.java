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
public class RandomConnectionStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/client/RandomConnectionStrategy", null, "org/apache/openejb/client/AbstractConnectionStrategy", null);

classWriter.visitInnerClass("org/apache/openejb/client/RandomConnectionStrategy$RandomIterator", "org/apache/openejb/client/RandomConnectionStrategy", "RandomIterator", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/client/RandomConnectionStrategy$RandomIterable", "org/apache/openejb/client/RandomConnectionStrategy", "RandomIterable", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/AbstractConnectionStrategy", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createFailureEvent", "(Ljava/util/Set;Ljava/util/Set;Ljava/net/URI;)Lorg/apache/openejb/client/event/FailoverSelection;", "(Ljava/util/Set<Ljava/net/URI;>;Ljava/util/Set<Ljava/net/URI;>;Ljava/net/URI;)Lorg/apache/openejb/client/event/FailoverSelection;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/event/RandomFailoverSelection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/event/RandomFailoverSelection", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/net/URI;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createIterable", "(Lorg/apache/openejb/client/ClusterMetaData;)Ljava/lang/Iterable;", "(Lorg/apache/openejb/client/ClusterMetaData;)Ljava/lang/Iterable<Ljava/net/URI;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RandomConnectionStrategy$RandomIterable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RandomConnectionStrategy$RandomIterable", "<init>", "(Lorg/apache/openejb/client/ClusterMetaData;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
