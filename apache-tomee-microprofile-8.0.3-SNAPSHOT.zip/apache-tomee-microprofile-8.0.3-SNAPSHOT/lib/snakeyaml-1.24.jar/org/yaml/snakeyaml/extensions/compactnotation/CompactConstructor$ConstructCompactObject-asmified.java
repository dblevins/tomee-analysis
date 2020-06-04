package asm.org.yaml.snakeyaml.extensions.compactnotation;
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
public class CompactConstructor$ConstructCompactObjectDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor$ConstructCompactObject", null, "org/yaml/snakeyaml/constructor/Constructor$ConstructMapping", null);

classWriter.visitInnerClass("org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor$ConstructCompactObject", "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor", "ConstructCompactObject", ACC_PUBLIC);

classWriter.visitInnerClass("org/yaml/snakeyaml/constructor/Constructor$ConstructMapping", "org/yaml/snakeyaml/constructor/Constructor", "ConstructMapping", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/yaml/snakeyaml/extensions/compactnotation/CompactConstructor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/extensions/compactnotation/CompactConstructor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor$ConstructCompactObject", "this$0", "Lorg/yaml/snakeyaml/extensions/compactnotation/CompactConstructor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/constructor/Constructor$ConstructMapping", "<init>", "(Lorg/yaml/snakeyaml/constructor/Constructor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "construct2ndStep", "(Lorg/yaml/snakeyaml/nodes/Node;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/nodes/MappingNode");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/nodes/MappingNode", "getValue", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/nodes/NodeTuple");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/nodes/NodeTuple", "getValueNode", "()Lorg/yaml/snakeyaml/nodes/Node;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/yaml/snakeyaml/nodes/MappingNode");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/nodes/Node", "setType", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/nodes/MappingNode");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor$ConstructCompactObject", "constructJavaBean2ndStep", "(Lorg/yaml/snakeyaml/nodes/MappingNode;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/yaml/snakeyaml/nodes/MappingNode", "org/yaml/snakeyaml/nodes/NodeTuple", "org/yaml/snakeyaml/nodes/Node"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor$ConstructCompactObject", "this$0", "Lorg/yaml/snakeyaml/extensions/compactnotation/CompactConstructor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor$ConstructCompactObject", "this$0", "Lorg/yaml/snakeyaml/extensions/compactnotation/CompactConstructor;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/nodes/SequenceNode");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor", "access$000", "(Lorg/yaml/snakeyaml/extensions/compactnotation/CompactConstructor;Lorg/yaml/snakeyaml/nodes/SequenceNode;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor", "applySequence", "(Ljava/lang/Object;Ljava/util/List;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "construct", "(Lorg/yaml/snakeyaml/nodes/Node;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/yaml/snakeyaml/nodes/MappingNode");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/nodes/MappingNode");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/nodes/MappingNode", "getValue", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/nodes/NodeTuple");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/nodes/Node", "setTwoStepsConstruction", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/nodes/NodeTuple", "getKeyNode", "()Lorg/yaml/snakeyaml/nodes/Node;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/nodes/ScalarNode");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/nodes/ScalarNode");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/yaml/snakeyaml/nodes/ScalarNode"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor$ConstructCompactObject", "this$0", "Lorg/yaml/snakeyaml/extensions/compactnotation/CompactConstructor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/nodes/ScalarNode", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor", "getCompactData", "(Ljava/lang/String;)Lorg/yaml/snakeyaml/extensions/compactnotation/CompactData;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor$ConstructCompactObject", "this$0", "Lorg/yaml/snakeyaml/extensions/compactnotation/CompactConstructor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor", "access$100", "(Lorg/yaml/snakeyaml/extensions/compactnotation/CompactConstructor;Lorg/yaml/snakeyaml/nodes/ScalarNode;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/yaml/snakeyaml/extensions/compactnotation/CompactData"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor$ConstructCompactObject", "this$0", "Lorg/yaml/snakeyaml/extensions/compactnotation/CompactConstructor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/extensions/compactnotation/CompactConstructor", "constructCompactFormat", "(Lorg/yaml/snakeyaml/nodes/ScalarNode;Lorg/yaml/snakeyaml/extensions/compactnotation/CompactData;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
