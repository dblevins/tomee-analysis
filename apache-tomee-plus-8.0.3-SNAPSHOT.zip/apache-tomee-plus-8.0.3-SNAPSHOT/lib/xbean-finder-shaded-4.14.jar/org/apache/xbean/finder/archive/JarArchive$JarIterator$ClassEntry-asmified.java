package asm.org.apache.xbean.finder.archive;
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
public class JarArchive$JarIterator$ClassEntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", null, "java/lang/Object", new String[] { "org/apache/xbean/finder/archive/Archive$Entry" });

classWriter.visitInnerClass("org/apache/xbean/finder/archive/JarArchive$JarIterator", "org/apache/xbean/finder/archive/JarArchive", "JarIterator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "org/apache/xbean/finder/archive/JarArchive$JarIterator", "ClassEntry", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/xbean/finder/archive/JarArchive$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/xbean/finder/archive/Archive$Entry", "org/apache/xbean/finder/archive/Archive", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "entry", "Ljava/util/jar/JarEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/xbean/finder/archive/JarArchive$JarIterator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/xbean/finder/archive/JarArchive$JarIterator;Ljava/util/jar/JarEntry;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "this$1", "Lorg/apache/xbean/finder/archive/JarArchive$JarIterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "entry", "Ljava/util/jar/JarEntry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBytecode", "()Ljava/io/InputStream;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "this$1", "Lorg/apache/xbean/finder/archive/JarArchive$JarIterator;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator", "this$0", "Lorg/apache/xbean/finder/archive/JarArchive;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/archive/JarArchive", "access$200", "(Lorg/apache/xbean/finder/archive/JarArchive;)Lorg/apache/xbean/finder/archive/MJarSupport;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/archive/MJarSupport", "isMjar", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "this$1", "Lorg/apache/xbean/finder/archive/JarArchive$JarIterator;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator", "this$0", "Lorg/apache/xbean/finder/archive/JarArchive;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/archive/JarArchive", "access$100", "(Lorg/apache/xbean/finder/archive/JarArchive;)Ljava/util/jar/JarFile;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "entry", "Ljava/util/jar/JarEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarEntry", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarFile", "getJarEntry", "(Ljava/lang/String;)Ljava/util/jar/JarEntry;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "this$1", "Lorg/apache/xbean/finder/archive/JarArchive$JarIterator;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator", "this$0", "Lorg/apache/xbean/finder/archive/JarArchive;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/archive/JarArchive", "access$100", "(Lorg/apache/xbean/finder/archive/JarArchive;)Ljava/util/jar/JarFile;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarFile", "getInputStream", "(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "this$1", "Lorg/apache/xbean/finder/archive/JarArchive$JarIterator;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator", "this$0", "Lorg/apache/xbean/finder/archive/JarArchive;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/archive/JarArchive", "access$100", "(Lorg/apache/xbean/finder/archive/JarArchive;)Ljava/util/jar/JarFile;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "entry", "Ljava/util/jar/JarEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarFile", "getInputStream", "(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/xbean/finder/archive/JarArchive$JarIterator;Ljava/util/jar/JarEntry;Ljava/lang/String;Lorg/apache/xbean/finder/archive/JarArchive$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/archive/JarArchive$JarIterator$ClassEntry", "<init>", "(Lorg/apache/xbean/finder/archive/JarArchive$JarIterator;Ljava/util/jar/JarEntry;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
