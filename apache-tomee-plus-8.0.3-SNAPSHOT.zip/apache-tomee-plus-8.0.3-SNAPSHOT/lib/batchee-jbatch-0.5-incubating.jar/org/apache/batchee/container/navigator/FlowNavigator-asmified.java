package asm.org.apache.batchee.container.navigator;
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
public class FlowNavigatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/navigator/FlowNavigator", "Lorg/apache/batchee/container/navigator/AbstractNavigator<Lorg/apache/batchee/jaxb/Flow;>;Lorg/apache/batchee/container/navigator/ModelNavigator<Lorg/apache/batchee/jaxb/Flow;>;", "org/apache/batchee/container/navigator/AbstractNavigator", new String[] { "org/apache/batchee/container/navigator/ModelNavigator" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "flow", "Lorg/apache/batchee/jaxb/Flow;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/batchee/jaxb/Flow;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/navigator/AbstractNavigator", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/navigator/FlowNavigator", "flow", "Lorg/apache/batchee/jaxb/Flow;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/navigator/FlowNavigator", "flow", "Lorg/apache/batchee/jaxb/Flow;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFirstExecutionElement", "(Ljava/lang/String;)Lorg/apache/batchee/container/jsl/ExecutionElement;", null, new String[] { "org/apache/batchee/container/jsl/IllegalTransitionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/navigator/FlowNavigator", "flow", "Lorg/apache/batchee/jaxb/Flow;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Flow", "getExecutionElements", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/navigator/FlowNavigator", "getFirstExecutionElement", "(Ljava/util/List;Ljava/lang/String;)Lorg/apache/batchee/container/jsl/ExecutionElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNextTransition", "(Lorg/apache/batchee/container/jsl/ExecutionElement;Lorg/apache/batchee/container/status/ExecutionStatus;)Lorg/apache/batchee/container/jsl/Transition;", null, new String[] { "org/apache/batchee/container/jsl/IllegalTransitionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/navigator/FlowNavigator", "flow", "Lorg/apache/batchee/jaxb/Flow;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Flow", "getExecutionElements", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/navigator/FlowNavigator", "getNextTransition", "(Lorg/apache/batchee/container/jsl/ExecutionElement;Ljava/util/List;Lorg/apache/batchee/container/status/ExecutionStatus;)Lorg/apache/batchee/container/jsl/Transition;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRootModelElement", "()Lorg/apache/batchee/jaxb/Flow;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/navigator/FlowNavigator", "flow", "Lorg/apache/batchee/jaxb/Flow;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("FlowNavigator for flow id = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/navigator/FlowNavigator", "flow", "Lorg/apache/batchee/jaxb/Flow;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Flow", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getRootModelElement", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/navigator/FlowNavigator", "getRootModelElement", "()Lorg/apache/batchee/jaxb/Flow;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
