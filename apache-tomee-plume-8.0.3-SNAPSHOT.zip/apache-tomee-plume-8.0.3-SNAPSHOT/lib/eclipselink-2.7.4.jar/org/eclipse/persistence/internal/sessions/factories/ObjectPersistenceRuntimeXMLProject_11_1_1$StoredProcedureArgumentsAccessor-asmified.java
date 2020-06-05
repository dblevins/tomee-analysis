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
public class ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessor", null, "org/eclipse/persistence/mappings/AttributeAccessor", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "StoredProcedureArgument", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessor", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "StoredProcedureArgumentsAccessor", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "StoredProcedureInOutArgument", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutArgument", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "StoredProcedureOutArgument", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutCursorArgument", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "StoredProcedureOutCursorArgument", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessor", "this$0", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/mappings/AttributeAccessor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeValueFromObject", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DescriptorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/queries/StoredProcedureCall");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/StoredProcedureCall", "getParameterTypes", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/StoredProcedureCall", "getParameters", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/StoredProcedureCall", "getProcedureArgumentNames", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "java/util/Vector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Vector", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/StoredProcedureCall", "getFirstParameterIndexForCallString", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessor", "java/lang/Object", "org/eclipse/persistence/queries/StoredProcedureCall", "java/util/List", "java/util/List", "java/util/List", "java/util/List", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/databaseaccess/DatasourceCall", "IN", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessor", "this$0", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessor", "java/lang/Object", "org/eclipse/persistence/queries/StoredProcedureCall", "java/util/List", "java/util/List", "java/util/List", "java/util/List", Opcodes.INTEGER, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "java/lang/Integer", "java/lang/Object", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/databaseaccess/DatasourceCall", "OUT", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutArgument");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessor", "this$0", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutArgument", "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/databaseaccess/DatasourceCall", "INOUT", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessor", "this$0", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument", "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutCursorArgument");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessor", "this$0", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutCursorArgument", "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "argumentName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/helper/DatabaseField");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "setDatabaseField", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)V", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitTypeInsn(INSTANCEOF, "[Ljava/lang/Object;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/helper/DatabaseField");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "setDatabaseField", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)V", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "org/eclipse/persistence/internal/helper/DatabaseField"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "argumentValue", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "setDatabaseField", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument");
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseField", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument", "outputArgumentName", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "argumentValue", "Ljava/lang/Object;");
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessor", "java/lang/Object", "org/eclipse/persistence/queries/StoredProcedureCall", "java/util/List", "java/util/List", "java/util/List", "java/util/List", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 15);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttributeValueInObject", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, new String[] { "org/eclipse/persistence/exceptions/DescriptorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/queries/StoredProcedureCall");
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
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/eclipse/persistence/queries/StoredProcedureCall", "java/util/Vector", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "get", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "getDirection", "()Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "getDatabaseField", "()Lorg/eclipse/persistence/internal/helper/DatabaseField;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/StoredProcedureCall", "getProcedureArgumentNames", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "argumentName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/databaseaccess/DatasourceCall", "IN", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "argumentValue", "Ljava/lang/Object;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "argumentValue", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/StoredProcedureCall", "appendIn", "(Ljava/lang/Object;)V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "java/lang/Integer", "org/eclipse/persistence/internal/helper/DatabaseField"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/StoredProcedureCall", "appendIn", "(Ljava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/databaseaccess/DatasourceCall", "OUT", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/StoredProcedureCall", "appendOut", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/databaseaccess/DatasourceCall", "OUT_CURSOR", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "equals", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/StoredProcedureCall", "appendOutCursor", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/databaseaccess/DatasourceCall", "INOUT", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument", "outputArgumentName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/DatabaseField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/DatabaseField", "type", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/DatabaseField", "type", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument", "argumentValue", "Ljava/lang/Object;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument", "argumentValue", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/StoredProcedureCall", "appendInOut", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/helper/DatabaseField;)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument", "org/eclipse/persistence/internal/helper/DatabaseField"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/StoredProcedureCall", "appendInOut", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/helper/DatabaseField;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentsAccessor", "java/lang/Object", "java/lang/Object", "org/eclipse/persistence/queries/StoredProcedureCall", "java/util/Vector", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "size", "()I", false);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 11);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}