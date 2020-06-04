package asm.org.hsqldb.lib;
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
public class FileUtil$FileSyncDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/lib/FileUtil$FileSync", null, "java/lang/Object", new String[] { "org/hsqldb/lib/FileAccess$FileSync" });

classWriter.visitInnerClass("org/hsqldb/lib/FileUtil$FileSync", "org/hsqldb/lib/FileUtil", "FileSync", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/hsqldb/lib/FileAccess$FileSync", "org/hsqldb/lib/FileAccess", "FileSync", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(0, "outDescriptor", "Ljava/io/FileDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/io/FileOutputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/FileOutputStream", "getFD", "()Ljava/io/FileDescriptor;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/lib/FileUtil$FileSync", "outDescriptor", "Ljava/io/FileDescriptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sync", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/lib/FileUtil$FileSync", "outDescriptor", "Ljava/io/FileDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/FileDescriptor", "sync", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
