package asm.com.fasterxml.jackson.core.util;
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
public class DefaultPrettyPrinterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "Ljava/lang/Object;Lcom/fasterxml/jackson/core/PrettyPrinter;Lcom/fasterxml/jackson/core/util/Instantiatable<Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;>;Ljava/io/Serializable;", "java/lang/Object", new String[] { "com/fasterxml/jackson/core/PrettyPrinter", "com/fasterxml/jackson/core/util/Instantiatable", "java/io/Serializable" });

classWriter.visitInnerClass("com/fasterxml/jackson/core/util/DefaultPrettyPrinter$FixedSpaceIndenter", "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "FixedSpaceIndenter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/core/util/DefaultPrettyPrinter$NopIndenter", "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "NopIndenter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter", "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "Indenter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_ROOT_VALUE_SEPARATOR", "Lcom/fasterxml/jackson/core/io/SerializedString;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_rootSeparator", "Lcom/fasterxml/jackson/core/SerializableString;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_spacesInObjectEntries", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "_nesting", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_separators", "Lcom/fasterxml/jackson/core/util/Separators;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_objectFieldValueSeparatorWithSpaces", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "DEFAULT_ROOT_VALUE_SEPARATOR", "Lcom/fasterxml/jackson/core/io/SerializedString;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "<init>", "(Lcom/fasterxml/jackson/core/SerializableString;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.UNINITIALIZED_THIS});
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/io/SerializedString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/io/SerializedString", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "java/lang/String"}, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "com/fasterxml/jackson/core/io/SerializedString"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "<init>", "(Lcom/fasterxml/jackson/core/SerializableString;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/fasterxml/jackson/core/SerializableString;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$FixedSpaceIndenter", "instance", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$FixedSpaceIndenter;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/util/DefaultIndenter", "SYSTEM_LINEFEED_INSTANCE", "Lcom/fasterxml/jackson/core/util/DefaultIndenter;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_spacesInObjectEntries", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_rootSeparator", "Lcom/fasterxml/jackson/core/SerializableString;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "DEFAULT_SEPARATORS", "Lcom/fasterxml/jackson/core/util/Separators;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "withSeparators", "(Lcom/fasterxml/jackson/core/util/Separators;)Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_rootSeparator", "Lcom/fasterxml/jackson/core/SerializableString;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "<init>", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;Lcom/fasterxml/jackson/core/SerializableString;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;Lcom/fasterxml/jackson/core/SerializableString;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$FixedSpaceIndenter", "instance", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$FixedSpaceIndenter;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/util/DefaultIndenter", "SYSTEM_LINEFEED_INSTANCE", "Lcom/fasterxml/jackson/core/util/DefaultIndenter;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_spacesInObjectEntries", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_spacesInObjectEntries", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_spacesInObjectEntries", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_separators", "Lcom/fasterxml/jackson/core/util/Separators;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_separators", "Lcom/fasterxml/jackson/core/util/Separators;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectFieldValueSeparatorWithSpaces", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectFieldValueSeparatorWithSpaces", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_rootSeparator", "Lcom/fasterxml/jackson/core/SerializableString;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withRootSeparator", "(Lcom/fasterxml/jackson/core/SerializableString;)Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_rootSeparator", "Lcom/fasterxml/jackson/core/SerializableString;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_rootSeparator", "Lcom/fasterxml/jackson/core/SerializableString;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "<init>", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;Lcom/fasterxml/jackson/core/SerializableString;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withRootSeparator", "(Ljava/lang/String;)Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/core/util/DefaultPrettyPrinter"});
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/io/SerializedString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/io/SerializedString", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "java/lang/String"}, 2, new Object[] {"com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "com/fasterxml/jackson/core/io/SerializedString"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "withRootSeparator", "(Lcom/fasterxml/jackson/core/SerializableString;)Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "indentArraysWith", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$NopIndenter", "instance", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$NopIndenter;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/core/util/DefaultPrettyPrinter"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter"}, 2, new Object[] {"com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter"});
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "indentObjectsWith", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$NopIndenter", "instance", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$NopIndenter;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/core/util/DefaultPrettyPrinter"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter"}, 2, new Object[] {"com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter"});
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withArrayIndenter", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;)Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$NopIndenter", "instance", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$NopIndenter;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "<init>", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withObjectIndenter", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;)Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$NopIndenter", "instance", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$NopIndenter;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "<init>", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withSpacesInObjectEntries", "()Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_withSpaces", "(Z)Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withoutSpacesInObjectEntries", "()Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_withSpaces", "(Z)Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "_withSpaces", "(Z)Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_spacesInObjectEntries", "Z");
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "<init>", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_spacesInObjectEntries", "Z");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withSeparators", "(Lcom/fasterxml/jackson/core/util/Separators;)Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_separators", "Lcom/fasterxml/jackson/core/util/Separators;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/util/Separators", "getObjectFieldValueSeparator", "()C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectFieldValueSeparatorWithSpaces", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInstance", "()Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Failed `createInstance()`: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" does not override method; it has to");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "<init>", "(Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeRootValueSeparator", "(Lcom/fasterxml/jackson/core/JsonGenerator;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_rootSeparator", "Lcom/fasterxml/jackson/core/SerializableString;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_rootSeparator", "Lcom/fasterxml/jackson/core/SerializableString;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeRaw", "(Lcom/fasterxml/jackson/core/SerializableString;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartObject", "(Lcom/fasterxml/jackson/core/JsonGenerator;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 123);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeRaw", "(C)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter", "isInline", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeObjectEntries", "(Lcom/fasterxml/jackson/core/JsonGenerator;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter", "writeIndentation", "(Lcom/fasterxml/jackson/core/JsonGenerator;I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeObjectFieldValueSeparator", "(Lcom/fasterxml/jackson/core/JsonGenerator;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_spacesInObjectEntries", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectFieldValueSeparatorWithSpaces", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeRaw", "(Ljava/lang/String;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_separators", "Lcom/fasterxml/jackson/core/util/Separators;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/util/Separators", "getObjectFieldValueSeparator", "()C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeRaw", "(C)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeObjectEntrySeparator", "(Lcom/fasterxml/jackson/core/JsonGenerator;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_separators", "Lcom/fasterxml/jackson/core/util/Separators;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/util/Separators", "getObjectEntrySeparator", "()C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeRaw", "(C)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter", "writeIndentation", "(Lcom/fasterxml/jackson/core/JsonGenerator;I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeEndObject", "(Lcom/fasterxml/jackson/core/JsonGenerator;I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter", "isInline", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_objectIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter", "writeIndentation", "(Lcom/fasterxml/jackson/core/JsonGenerator;I)V", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeRaw", "(C)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeRaw", "(C)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartArray", "(Lcom/fasterxml/jackson/core/JsonGenerator;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter", "isInline", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeRaw", "(C)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeArrayValues", "(Lcom/fasterxml/jackson/core/JsonGenerator;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter", "writeIndentation", "(Lcom/fasterxml/jackson/core/JsonGenerator;I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeArrayValueSeparator", "(Lcom/fasterxml/jackson/core/JsonGenerator;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_separators", "Lcom/fasterxml/jackson/core/util/Separators;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/util/Separators", "getArrayValueSeparator", "()C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeRaw", "(C)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter", "writeIndentation", "(Lcom/fasterxml/jackson/core/JsonGenerator;I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeEndArray", "(Lcom/fasterxml/jackson/core/JsonGenerator;I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter", "isInline", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_arrayIndenter", "Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "_nesting", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter$Indenter", "writeIndentation", "(Lcom/fasterxml/jackson/core/JsonGenerator;I)V", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeRaw", "(C)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeRaw", "(C)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createInstance", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "createInstance", "()Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/io/SerializedString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/io/SerializedString", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/util/DefaultPrettyPrinter", "DEFAULT_ROOT_VALUE_SEPARATOR", "Lcom/fasterxml/jackson/core/io/SerializedString;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
