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
public class ObjectPersistenceRuntimeXMLProject$12Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject$12", null, "org/eclipse/persistence/mappings/AttributeAccessor", null);

classWriter.visitOuterClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject", "buildRelationalDescriptorDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;");

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject$12", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject$12", "this$0", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/mappings/AttributeAccessor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeValueFromObject", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/ClassDescriptor");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getMultipleTablePrimaryKeyAssociations", "()Ljava/util/Vector;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/eclipse/persistence/descriptors/ClassDescriptor", "java/util/Vector", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "get", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/mappings/Association");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/Association", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/DatabaseField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/Association", "setKey", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/Association", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/DatabaseField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/Association", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "size", "()I", false);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttributeValueInObject", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/ClassDescriptor");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Vector");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/eclipse/persistence/descriptors/ClassDescriptor", "java/util/Vector", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "get", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/mappings/Association");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/Association", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseField", "getQualifiedName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/Association", "setKey", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/Association", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseField", "getQualifiedName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/Association", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "size", "()I", false);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "setForeignKeyFieldNamesForMultipleTable", "(Ljava/util/Vector;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
