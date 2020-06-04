package asm.org.eclipse.persistence.internal.sessions.factories;
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
public class ObjectPersistenceRuntimeXMLProject_11_1_1$NullPolicyAttributeAccessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$NullPolicyAttributeAccessor", null, "org/eclipse/persistence/mappings/AttributeAccessor", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$NullPolicyAttributeAccessor", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "NullPolicyAttributeAccessor", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/mappings/AttributeAccessor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeValueFromObject", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DescriptorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/mappings/XMLNillableMapping");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/oxm/mappings/XMLNillableMapping", "getNullPolicy", "()Lorg/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/oxm/mappings/nullpolicy/NullPolicy");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/mappings/nullpolicy/NullPolicy");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/nullpolicy/NullPolicy", "getIsSetPerformedForAbsentNode", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/nullpolicy/NullPolicy", "isNullRepresentedByEmptyNode", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/nullpolicy/NullPolicy", "isNullRepresentedByXsiNil", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/nullpolicy/NullPolicy", "getMarshalNullRepresentation", "()Lorg/eclipse/persistence/oxm/mappings/nullpolicy/XMLNullRepresentationType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/oxm/mappings/nullpolicy/XMLNullRepresentationType", "ABSENT_NODE", "Lorg/eclipse/persistence/oxm/mappings/nullpolicy/XMLNullRepresentationType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/nullpolicy/XMLNullRepresentationType", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/mappings/XMLNillableMapping");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/oxm/mappings/XMLNillableMapping", "getNullPolicy", "()Lorg/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttributeValueInObject", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, new String[] { "org/eclipse/persistence/exceptions/DescriptorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/mappings/XMLNillableMapping");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/mappings/nullpolicy/NullPolicy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/mappings/nullpolicy/NullPolicy", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/oxm/mappings/XMLNillableMapping", "setNullPolicy", "(Lorg/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy;)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/mappings/XMLNillableMapping");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/oxm/mappings/XMLNillableMapping", "setNullPolicy", "(Lorg/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
