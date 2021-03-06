package asm.jakarta.faces.component;
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
public class StateHolderSaverDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "jakarta/faces/component/StateHolderSaver", null, "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "jakarta/faces/component/StateHolderSaver", "StateHolderTupleIndices", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(6470180891722042701L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "className", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "savedState", "Ljava/io/Serializable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DYNAMIC_COMPONENT", "Ljava/lang/String;", null, "com.sun.faces.DynamicComponent");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "componentAddedDynamically", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "className", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "savedState", "Ljava/io/Serializable;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "className", "Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "savedState", "Ljava/io/Serializable;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "savedState", "Ljava/io/Serializable;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/io/Serializable;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/io/Serializable;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "ComponentAddedDynamically", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "ordinal", "()I", false);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/faces/context/FacesContext;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/StateHolderSaver", "className", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/StateHolderSaver", "savedState", "Ljava/io/Serializable;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/StateHolderSaver", "className", "Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"jakarta/faces/component/StateHolderSaver", "jakarta/faces/context/FacesContext", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/StateHolderSaver", "className", "Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/faces/component/StateHolder");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/StateHolder");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHolder", "isTransient", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "LastMember", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "ordinal", "()I", false);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/io/Serializable");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "StateHolderSaverInstance", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "ordinal", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/StateHolder");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHolder", "saveState", "(Ljakarta/faces/context/FacesContext;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/io/Serializable");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/faces/component/UIComponent");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "ComponentAddedDynamically", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "ordinal", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/UIComponent");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/UIComponent", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("com.sun.faces.DynamicComponent");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"jakarta/faces/component/StateHolderSaver", "jakarta/faces/context/FacesContext", "java/lang/Object", "[Ljava/io/Serializable;"}, 2, new Object[] {"[Ljava/io/Serializable;", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"jakarta/faces/component/StateHolderSaver", "jakarta/faces/context/FacesContext", "java/lang/Object", "[Ljava/io/Serializable;"}, 3, new Object[] {"[Ljava/io/Serializable;", Opcodes.INTEGER, "java/lang/Boolean"});
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/StateHolderSaver", "savedState", "Ljava/io/Serializable;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/StateHolderSaver", "className", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/io/Serializable");
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/io/Serializable");
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/StateHolderSaver", "savedState", "Ljava/io/Serializable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/StateHolderSaver", "className", "Ljava/lang/String;");
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "restore", "(Ljakarta/faces/context/FacesContext;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/InstantiationException");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label6, "java/lang/IllegalAccessException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "className", "Ljava/lang/String;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "savedState", "Ljava/io/Serializable;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "savedState", "Ljava/io/Serializable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "className", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "className", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/StateHolderSaver", "loadClass", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label9);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InstantiationException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/IllegalAccessException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label10);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "savedState", "Ljava/io/Serializable;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/faces/component/StateHolder");
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/StateHolderSaver", "savedState", "Ljava/io/Serializable;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/io/Serializable;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/io/Serializable;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/StateHolder");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "StateHolderSaverInstance", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "ordinal", "()I", false);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHolder", "restoreState", "(Ljakarta/faces/context/FacesContext;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "loadClass", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Class;", null, new String[] { "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/ClassLoader"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
