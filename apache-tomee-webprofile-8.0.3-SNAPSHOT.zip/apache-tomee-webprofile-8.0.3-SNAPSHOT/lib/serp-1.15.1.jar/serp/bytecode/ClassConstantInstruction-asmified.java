package asm.serp.bytecode;
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
public class ClassConstantInstructionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "serp/bytecode/ClassConstantInstruction", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_params", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_wrappers", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_ins", "Lserp/bytecode/Instruction;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_code", "Lserp/bytecode/Code;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_class", "Lserp/bytecode/BCClass;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_invalid", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lserp/bytecode/BCClass;Lserp/bytecode/Code;Lserp/bytecode/Instruction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/ClassConstantInstruction", "_ins", "Lserp/bytecode/Instruction;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/ClassConstantInstruction", "_class", "Lserp/bytecode/BCClass;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/ClassConstantInstruction", "_invalid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/ClassConstantInstruction", "_class", "Lserp/bytecode/BCClass;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/ClassConstantInstruction", "_ins", "Lserp/bytecode/Instruction;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClass", "(Ljava/lang/String;)Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_class", "Lserp/bytecode/BCClass;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCClass", "getProject", "()Lserp/bytecode/Project;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Project", "getNameCache", "()Lserp/bytecode/NameCache;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/NameCache", "getExternalForm", "(Ljava/lang/String;Z)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "serp/bytecode/ClassConstantInstruction", "getWrapperClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ClassConstantInstruction", "setClassName", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_ins", "Lserp/bytecode/Instruction;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClass", "(Ljava/lang/Class;)Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ClassConstantInstruction", "setClass", "(Ljava/lang/String;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClass", "(Lserp/bytecode/BCClass;)Lserp/bytecode/Instruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCClass", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ClassConstantInstruction", "setClass", "(Ljava/lang/String;)Lserp/bytecode/Instruction;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setClassName", "(Ljava/lang/String;Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_invalid", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "hasNext", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "next", "()Lserp/bytecode/Instruction;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"serp/bytecode/Instruction"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_ins", "Lserp/bytecode/Instruction;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "before", "(Lserp/bytecode/Instruction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "next", "()Lserp/bytecode/Instruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getstatic", "()Lserp/bytecode/GetFieldInstruction;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("TYPE");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/GetFieldInstruction", "setField", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lserp/bytecode/FieldInstruction;", false);
methodVisitor.visitInsn(POP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"serp/bytecode/Instruction"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ClassConstantInstruction", "setObject", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "before", "(Lserp/bytecode/Instruction;)V", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "afterLast", "()V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "serp/bytecode/ClassConstantInstruction", "_invalid", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setObject", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ClassConstantInstruction", "addClassField", "(Ljava/lang/String;)Lserp/bytecode/BCField;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/ClassConstantInstruction", "addClassLoadMethod", "()Lserp/bytecode/BCMethod;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getstatic", "()Lserp/bytecode/GetFieldInstruction;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/GetFieldInstruction", "setField", "(Lserp/bytecode/BCField;)Lserp/bytecode/FieldInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "ifnull", "()Lserp/bytecode/IfInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "getstatic", "()Lserp/bytecode/GetFieldInstruction;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/GetFieldInstruction", "setField", "(Lserp/bytecode/BCField;)Lserp/bytecode/FieldInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "go2", "()Lserp/bytecode/JumpInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "constant", "()Lserp/bytecode/ConstantInstruction;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ConstantInstruction", "setValue", "(Ljava/lang/String;)Lserp/bytecode/ConstantInstruction;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/JumpInstruction", "setTarget", "(Lserp/bytecode/Instruction;)Lserp/bytecode/JumpInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "invokestatic", "()Lserp/bytecode/MethodInstruction;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MethodInstruction", "setMethod", "(Lserp/bytecode/BCMethod;)Lserp/bytecode/MethodInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "dup", "()Lserp/bytecode/StackInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "putstatic", "()Lserp/bytecode/PutFieldInstruction;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/PutFieldInstruction", "setField", "(Lserp/bytecode/BCField;)Lserp/bytecode/FieldInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_code", "Lserp/bytecode/Code;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "nop", "()Lserp/bytecode/Instruction;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/JumpInstruction", "setTarget", "(Lserp/bytecode/Instruction;)Lserp/bytecode/JumpInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addClassField", "(Ljava/lang/String;)Lserp/bytecode/BCField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("class$L");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_class", "Lserp/bytecode/BCClass;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCClass", "getDeclaredField", "(Ljava/lang/String;)Lserp/bytecode/BCField;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_class", "Lserp/bytecode/BCClass;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCClass", "declareField", "(Ljava/lang/String;Ljava/lang/Class;)Lserp/bytecode/BCField;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCField", "makePackage", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCField", "setStatic", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCField", "setSynthetic", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "serp/bytecode/BCField"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addClassLoadMethod", "()Lserp/bytecode/BCMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_class", "Lserp/bytecode/BCClass;");
methodVisitor.visitLdcInsn("class$");
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_params", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCClass", "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Lserp/bytecode/BCMethod;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"serp/bytecode/BCMethod"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "serp/bytecode/ClassConstantInstruction", "_class", "Lserp/bytecode/BCClass;");
methodVisitor.visitLdcInsn("class$");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_params", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCClass", "declareMethod", "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lserp/bytecode/BCMethod;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCMethod", "setStatic", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCMethod", "makePackage", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCMethod", "setSynthetic", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/BCMethod", "getCode", "(Z)Lserp/bytecode/Code;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "setMaxStack", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "setMaxLocals", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "aload", "()Lserp/bytecode/LoadInstruction;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LoadInstruction", "setLocal", "(I)Lserp/bytecode/LocalVariableInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "invokestatic", "()Lserp/bytecode/MethodInstruction;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitLdcInsn("forName");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_params", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MethodInstruction", "setMethod", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lserp/bytecode/MethodInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "areturn", "()Lserp/bytecode/ReturnInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "astore", "()Lserp/bytecode/StoreInstruction;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/StoreInstruction", "setLocal", "(I)Lserp/bytecode/LocalVariableInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "anew", "()Lserp/bytecode/ClassInstruction;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/NoClassDefFoundError;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/ClassInstruction", "setType", "(Ljava/lang/Class;)Lserp/bytecode/TypedInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "dup", "()Lserp/bytecode/StackInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "aload", "()Lserp/bytecode/LoadInstruction;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LoadInstruction", "setLocal", "(I)Lserp/bytecode/LocalVariableInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "invokevirtual", "()Lserp/bytecode/MethodInstruction;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Throwable;"));
methodVisitor.visitLdcInsn("getMessage");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MethodInstruction", "setMethod", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lserp/bytecode/MethodInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "invokespecial", "()Lserp/bytecode/MethodInstruction;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/NoClassDefFoundError;"));
methodVisitor.visitLdcInsn("<init>");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_params", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/MethodInstruction", "setMethod", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lserp/bytecode/MethodInstruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "athrow", "()Lserp/bytecode/Instruction;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/ClassNotFoundException;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/Code", "addExceptionHandler", "(Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Lserp/bytecode/Instruction;Ljava/lang/Class;)Lserp/bytecode/ExceptionHandler;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getWrapperClass", "(Ljava/lang/String;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_wrappers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "serp/bytecode/ClassConstantInstruction", "_params", "[Ljava/lang/Class;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "serp/bytecode/ClassConstantInstruction", "_wrappers", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_wrappers", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Byte", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Byte;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_wrappers", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Boolean;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_wrappers", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Character", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Character;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_wrappers", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Double;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_wrappers", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Float", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Float;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_wrappers", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Integer;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_wrappers", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "serp/bytecode/ClassConstantInstruction", "_wrappers", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Short", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Short;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
