package asm.javax.faces.component.behavior;
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
public class _AjaxBehaviorDeltaStateHelper$InternalDeltaListMapDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "javax/faces/component/behavior/_AjaxBehaviorDeltaStateHelper$InternalDeltaListMap", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljavax/faces/component/behavior/_AjaxBehaviorDeltaStateHelper$InternalMap<TK;TV;>;", "javax/faces/component/behavior/_AjaxBehaviorDeltaStateHelper$InternalMap", null);

classWriter.visitInnerClass("javax/faces/component/behavior/_AjaxBehaviorDeltaStateHelper$InternalDeltaListMap", "javax/faces/component/behavior/_AjaxBehaviorDeltaStateHelper", "InternalDeltaListMap", ACC_STATIC);

classWriter.visitInnerClass("javax/faces/component/behavior/_AjaxBehaviorDeltaStateHelper$InternalMap", "javax/faces/component/behavior/_AjaxBehaviorDeltaStateHelper", "InternalMap", ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/behavior/_AjaxBehaviorDeltaStateHelper$InternalMap", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(IF)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(FLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/behavior/_AjaxBehaviorDeltaStateHelper$InternalMap", "<init>", "(IF)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/behavior/_AjaxBehaviorDeltaStateHelper$InternalMap", "<init>", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Map;)V", "(Ljava/util/Map<+TK;+TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/behavior/_AjaxBehaviorDeltaStateHelper$InternalMap", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
