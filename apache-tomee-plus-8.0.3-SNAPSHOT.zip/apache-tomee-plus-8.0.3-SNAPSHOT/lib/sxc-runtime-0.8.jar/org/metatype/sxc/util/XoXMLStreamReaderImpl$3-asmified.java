package asm.org.metatype.sxc.util;
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
public class XoXMLStreamReaderImpl$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/metatype/sxc/util/XoXMLStreamReaderImpl$3", "Ljava/lang/Object;Ljava/lang/Iterable<Lorg/metatype/sxc/util/Attribute;>;", "java/lang/Object", new String[] { "java/lang/Iterable" });

classWriter.visitOuterClass("org/metatype/sxc/util/XoXMLStreamReaderImpl", "getAttributes", "()Ljava/lang/Iterable;");

classWriter.visitInnerClass("org/metatype/sxc/util/XoXMLStreamReaderImpl$3", null, null, 0);

classWriter.visitInnerClass("org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator", "org/metatype/sxc/util/XoXMLStreamReaderImpl", "AttributesIterator", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/metatype/sxc/util/XoXMLStreamReaderImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$3", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/metatype/sxc/util/Attribute;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$3", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator", "<init>", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
