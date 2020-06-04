package asm.org.eclipse.jdt.internal.compiler.apt.dispatch;
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
public class HookedJavaFileObjectDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "Ljavax/tools/ForwardingJavaFileObject<Ljavax/tools/JavaFileObject;>;", "javax/tools/ForwardingJavaFileObject", null);

classWriter.visitInnerClass("javax/tools/JavaFileObject$Kind", "javax/tools/JavaFileObject", "Kind", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject$ForwardingOutputStream", "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "ForwardingOutputStream", ACC_PRIVATE);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject$ForwardingWriter", "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "ForwardingWriter", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_filer", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_fileName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_closed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_typeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "$SWITCH_TABLE$javax$tools$JavaFileObject$Kind", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/tools/JavaFileObject;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/tools/ForwardingJavaFileObject", "<init>", "(Ljavax/tools/JavaFileObject;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_closed", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_filer", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_fileName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_typeName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "openOutputStream", "()Ljava/io/OutputStream;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject$ForwardingOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/tools/ForwardingJavaFileObject", "openOutputStream", "()Ljava/io/OutputStream;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject$ForwardingOutputStream", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject;Ljava/io/OutputStream;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "openWriter", "()Ljava/io/Writer;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject$ForwardingWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/tools/ForwardingJavaFileObject", "openWriter", "()Ljava/io/Writer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject$ForwardingWriter", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject;Ljava/io/Writer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "closed", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/eclipse/jdt/internal/compiler/classfmt/ClassFormatException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_closed", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_closed", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "$SWITCH_TABLE$javax$tools$JavaFileObject$Kind", "()[I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "getKind", "()Ljavax/tools/JavaFileObject$Kind;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/tools/JavaFileObject$Kind", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTableSwitchInsn(1, 4, label4, new Label[] { label5, label6, label4, label4 });
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/batch/CompilationUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_fileName", "Ljava/lang/String;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/batch/CompilationUnit", "<init>", "([CLjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_filer", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl", "addNewUnit", "(Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_fileName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/classfmt/ClassFileReader", "read", "(Ljava/lang/String;)Lorg/eclipse/jdt/internal/compiler/classfmt/ClassFileReader;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", Opcodes.TOP, "org/eclipse/jdt/internal/compiler/env/IBinaryType"}, 1, new Object[] {"org/eclipse/jdt/internal/compiler/classfmt/ClassFormatException"});
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_filer", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl", "_env", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "lookupEnvironment", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_typeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "splitOn", "(C[C)[[C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/LookupEnvironment", "getType", "([[C)Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_filer", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl", "addNewClassFile", "(Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;)V", false);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/jdt/internal/compiler/env/IBinaryType", "getName", "()[C", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_filer", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl", "_env", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "lookupEnvironment", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "splitOn", "(C[C)[[C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/LookupEnvironment", "getType", "([[C)Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding", "isValidBinding", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding", "isBinaryBinding", "()Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_filer", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl", "addNewClassFile", "(Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[C", "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/BinaryTypeBinding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding", "getPackage", "()Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_filer", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl", "_env", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "lookupEnvironment", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/BinaryTypeBinding", "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;Lorg/eclipse/jdt/internal/compiler/env/IBinaryType;Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;Z)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "_filer", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/BatchFilerImpl", "addNewClassFile", "(Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "$SWITCH_TABLE$javax$tools$JavaFileObject$Kind", "()[I", null, null);
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "$SWITCH_TABLE$javax$tools$JavaFileObject$Kind", "[I");
methodVisitor.visitInsn(DUP);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"[I"});
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/tools/JavaFileObject$Kind", "values", "()[Ljavax/tools/JavaFileObject$Kind;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/tools/JavaFileObject$Kind", "CLASS", "Ljavax/tools/JavaFileObject$Kind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/tools/JavaFileObject$Kind", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"[I"}, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/tools/JavaFileObject$Kind", "HTML", "Ljavax/tools/JavaFileObject$Kind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/tools/JavaFileObject$Kind", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/tools/JavaFileObject$Kind", "OTHER", "Ljavax/tools/JavaFileObject$Kind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/tools/JavaFileObject$Kind", "ordinal", "()I", false);
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
methodVisitor.visitFieldInsn(GETSTATIC, "javax/tools/JavaFileObject$Kind", "SOURCE", "Ljavax/tools/JavaFileObject$Kind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/tools/JavaFileObject$Kind", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
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
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/dispatch/HookedJavaFileObject", "$SWITCH_TABLE$javax$tools$JavaFileObject$Kind", "[I");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
