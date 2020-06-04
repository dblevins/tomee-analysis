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
public class ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", null, "org/eclipse/persistence/internal/descriptors/InstantiationPolicy", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "StoredProcedureArgument", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "StoredProcedureArgumentInstantiationPolicy", ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "StoredProcedureArgumentType", ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "StoredProcedureInOutArgument", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutArgument", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "StoredProcedureOutArgument", 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutCursorArgument", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "StoredProcedureOutCursorArgument", 0);

{
fieldVisitor = classWriter.visitField(0, "outer", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "argType", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "$SWITCH_TABLE$org$eclipse$persistence$internal$sessions$factories$ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/descriptors/InstantiationPolicy", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", "outer", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", "argType", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildNewInstance", "()Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DescriptorException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", "$SWITCH_TABLE$org$eclipse$persistence$internal$sessions$factories$ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "()[I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", "argType", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTableSwitchInsn(1, 4, label4, new Label[] { label0, label1, label2, label3 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", "outer", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgument", "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", "outer", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureInOutArgument", "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutArgument");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", "outer", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutArgument", "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutCursorArgument");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", "outer", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureOutCursorArgument", "<init>", "(Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "$SWITCH_TABLE$org$eclipse$persistence$internal$sessions$factories$ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "()[I", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchFieldError");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/NoSuchFieldError");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/NoSuchFieldError");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/NoSuchFieldError");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", "$SWITCH_TABLE$org$eclipse$persistence$internal$sessions$factories$ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "[I");
methodVisitor.visitInsn(DUP);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"[I"});
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "values", "()[Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "STORED_PROCEDURE_ARG", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"[I"}, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "STORED_PROCEDURE_INOUT_ARG", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "STORED_PROCEDURE_OUTCURSOR_ARG", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "STORED_PROCEDURE_OUT_ARG", "Lorg/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label10);
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentInstantiationPolicy", "$SWITCH_TABLE$org$eclipse$persistence$internal$sessions$factories$ObjectPersistenceRuntimeXMLProject_11_1_1$StoredProcedureArgumentType", "[I");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
