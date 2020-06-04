package asm.org.eclipse.jdt.internal.compiler.apt.util;
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
public class ModuleLocationHandler$SystemLocationContainerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$SystemLocationContainer", null, "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$LocationContainer", null);

classWriter.visitInnerClass("javax/tools/JavaFileManager$Location", "javax/tools/JavaFileManager", "Location", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$LocationContainer", "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler", "LocationContainer", 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$ModuleLocationWrapper", "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler", "ModuleLocationWrapper", 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$SystemLocationContainer", "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler", "SystemLocationContainer", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler;Ljavax/tools/JavaFileManager$Location;Lorg/eclipse/jdt/internal/compiler/apt/util/JrtFileSystem;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$SystemLocationContainer", "this$0", "Lorg/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$LocationContainer", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler;Ljavax/tools/JavaFileManager$Location;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/util/JrtFileSystem", "initialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/util/JrtFileSystem", "modulePathMap", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "keySet", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$SystemLocationContainer", "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler", "javax/tools/JavaFileManager$Location", "org/eclipse/jdt/internal/compiler/apt/util/JrtFileSystem", "java/util/HashMap", "java/util/Set", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/util/JrtFileSystem", "file", "Ljava/io/File;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "toPath", "()Ljava/nio/file/Path;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$ModuleLocationWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$ModuleLocationWrapper", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler;Ljavax/tools/JavaFileManager$Location;Ljava/lang/String;ZLjava/lang/Iterable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$SystemLocationContainer", "locationNames", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$SystemLocationContainer", "locationPaths", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler;Ljavax/tools/JavaFileManager$Location;Lorg/eclipse/jdt/internal/compiler/batch/ClasspathJrt;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/util/JrtFileSystem");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/batch/ClasspathJrt", "file", "Ljava/io/File;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/util/JrtFileSystem", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler$SystemLocationContainer", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/util/ModuleLocationHandler;Ljavax/tools/JavaFileManager$Location;Lorg/eclipse/jdt/internal/compiler/apt/util/JrtFileSystem;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
