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
public class BaseProcessingEnvImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", null, "java/lang/Object", new String[] { "javax/annotation/processing/ProcessingEnvironment" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_filer", "Ljavax/annotation/processing/Filer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_messager", "Ljavax/annotation/processing/Messager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_processorOptions", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_elementUtils", "Ljavax/lang/model/util/Elements;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_typeUtils", "Ljavax/lang/model/util/Types;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_addedUnits", "Ljava/util/List;", "Ljava/util/List<Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_addedClassFiles", "Ljava/util/List;", "Ljava/util/List<Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_deletedUnits", "Ljava/util/List;", "Ljava/util/List<Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_errorRaised", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_factory", "Lorg/eclipse/jdt/internal/compiler/apt/model/Factory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "_current_module", "Lorg/eclipse/jdt/internal/compiler/lookup/ModuleBinding;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_addedUnits", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_addedClassFiles", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_deletedUnits", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/apt/model/ElementsImpl", "create", "(Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;)Lorg/eclipse/jdt/internal/compiler/apt/model/ElementsImpl;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_elementUtils", "Ljavax/lang/model/util/Elements;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/TypesImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/TypesImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_typeUtils", "Ljavax/lang/model/util/Types;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/Factory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/Factory", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_factory", "Lorg/eclipse/jdt/internal/compiler/apt/model/Factory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_errorRaised", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addNewUnit", "(Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_addedUnits", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addNewClassFile", "(Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_addedClassFiles", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCompiler", "()Lorg/eclipse/jdt/internal/compiler/Compiler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeletedUnits", "()[Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_deletedUnits", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/env/ICompilationUnit");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_deletedUnits", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNewUnits", "()[Lorg/eclipse/jdt/internal/compiler/env/ICompilationUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_addedUnits", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/env/ICompilationUnit");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_addedUnits", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementUtils", "()Ljavax/lang/model/util/Elements;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_elementUtils", "Ljavax/lang/model/util/Elements;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFiler", "()Ljavax/annotation/processing/Filer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_filer", "Ljavax/annotation/processing/Filer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessager", "()Ljavax/annotation/processing/Messager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_messager", "Ljavax/annotation/processing/Messager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOptions", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_processorOptions", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeUtils", "()Ljavax/lang/model/util/Types;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_typeUtils", "Ljavax/lang/model/util/Types;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLookupEnvironment", "()Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "lookupEnvironment", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSourceVersion", "()Ljavax/lang/model/SourceVersion;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalArgumentException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/IllegalArgumentException");
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label2, "java/lang/IllegalArgumentException");
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label2, "java/lang/IllegalArgumentException");
Label label9 = new Label();
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label2, "java/lang/IllegalArgumentException");
Label label11 = new Label();
Label label12 = new Label();
methodVisitor.visitTryCatchBlock(label11, label12, label2, "java/lang/IllegalArgumentException");
Label label13 = new Label();
Label label14 = new Label();
methodVisitor.visitTryCatchBlock(label13, label14, label2, "java/lang/IllegalArgumentException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "sourceLevel", "J");
methodVisitor.visitLdcInsn(new Long(3211264L));
methodVisitor.visitInsn(LCMP);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFGT, label15);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/SourceVersion", "RELEASE_5", "Ljavax/lang/model/SourceVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "sourceLevel", "J");
methodVisitor.visitLdcInsn(new Long(3276800L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/SourceVersion", "RELEASE_6", "Ljavax/lang/model/SourceVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "sourceLevel", "J");
methodVisitor.visitLdcInsn(new Long(3342336L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLdcInsn("RELEASE_7");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/lang/model/SourceVersion", "valueOf", "(Ljava/lang/String;)Ljavax/lang/model/SourceVersion;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "sourceLevel", "J");
methodVisitor.visitLdcInsn(new Long(3407872L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitLdcInsn("RELEASE_8");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/lang/model/SourceVersion", "valueOf", "(Ljava/lang/String;)Ljavax/lang/model/SourceVersion;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "sourceLevel", "J");
methodVisitor.visitLdcInsn(new Long(3473408L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitLdcInsn("RELEASE_9");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/lang/model/SourceVersion", "valueOf", "(Ljava/lang/String;)Ljavax/lang/model/SourceVersion;", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "sourceLevel", "J");
methodVisitor.visitLdcInsn(new Long(3538944L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label9);
methodVisitor.visitLdcInsn("RELEASE_10");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/lang/model/SourceVersion", "valueOf", "(Ljava/lang/String;)Ljavax/lang/model/SourceVersion;", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "sourceLevel", "J");
methodVisitor.visitLdcInsn(new Long(3604480L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label11);
methodVisitor.visitLdcInsn("RELEASE_11");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/lang/model/SourceVersion", "valueOf", "(Ljava/lang/String;)Ljavax/lang/model/SourceVersion;", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "sourceLevel", "J");
methodVisitor.visitLdcInsn(new Long(3670016L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label13);
methodVisitor.visitLdcInsn("RELEASE_12");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/lang/model/SourceVersion", "valueOf", "(Ljava/lang/String;)Ljavax/lang/model/SourceVersion;", false);
methodVisitor.visitLabel(label12);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "sourceLevel", "J");
methodVisitor.visitLdcInsn(new Long(3735552L));
methodVisitor.visitInsn(LCMP);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNE, label16);
methodVisitor.visitLdcInsn("RELEASE_13");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/lang/model/SourceVersion", "valueOf", "(Ljava/lang/String;)Ljavax/lang/model/SourceVersion;", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/IllegalArgumentException"});
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/SourceVersion", "RELEASE_6", "Ljavax/lang/model/SourceVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/SourceVersion", "RELEASE_6", "Ljavax/lang/model/SourceVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_addedUnits", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_addedClassFiles", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_deletedUnits", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "clear", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "errorRaised", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_errorRaised", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setErrorRaised", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_errorRaised", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFactory", "()Lorg/eclipse/jdt/internal/compiler/apt/model/Factory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_factory", "Lorg/eclipse/jdt/internal/compiler/apt/model/Factory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNewClassFiles", "()[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_addedClassFiles", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_addedClassFiles", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPreviewEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "_compiler", "Lorg/eclipse/jdt/internal/compiler/Compiler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/Compiler", "options", "Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "enablePreviewFeatures", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
