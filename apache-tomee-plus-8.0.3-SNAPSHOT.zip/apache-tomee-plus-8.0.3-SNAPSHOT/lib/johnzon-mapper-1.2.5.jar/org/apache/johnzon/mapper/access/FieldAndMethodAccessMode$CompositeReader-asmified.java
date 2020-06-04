package asm.org.apache.johnzon.mapper.access;
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
public class FieldAndMethodAccessMode$CompositeReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeReader", "Lorg/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType<Lorg/apache/johnzon/mapper/access/AccessMode$Reader;>;Lorg/apache/johnzon/mapper/access/AccessMode$Reader;", "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", new String[] { "org/apache/johnzon/mapper/access/AccessMode$Reader" });

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/AccessMode$Reader", "org/apache/johnzon/mapper/access/AccessMode", "Reader", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeReader", "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode", "CompositeReader", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/johnzon/mapper/ObjectConverter$Writer", "org/apache/johnzon/mapper/ObjectConverter", "Writer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode", "CompositeDecoratedType", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "org/apache/johnzon/mapper/access/AccessMode", "DecoratedType", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/johnzon/mapper/access/AccessMode$Reader;Lorg/apache/johnzon/mapper/access/AccessMode$Reader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeDecoratedType", "<init>", "(Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;Lorg/apache/johnzon/mapper/access/FieldAndMethodAccessMode$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeReader", "type1", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/johnzon/mapper/access/AccessMode$Reader");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$Reader", "read", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findObjectConverterWriter", "()Lorg/apache/johnzon/mapper/ObjectConverter$Writer;", "()Lorg/apache/johnzon/mapper/ObjectConverter$Writer<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeReader", "type2", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/johnzon/mapper/access/AccessMode$Reader");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$Reader", "findObjectConverterWriter", "()Lorg/apache/johnzon/mapper/ObjectConverter$Writer;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeReader", "type1", "Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/johnzon/mapper/access/AccessMode$Reader");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$Reader", "findObjectConverterWriter", "()Lorg/apache/johnzon/mapper/ObjectConverter$Writer;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/johnzon/mapper/ObjectConverter$Writer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/johnzon/mapper/ObjectConverter$Writer"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/johnzon/mapper/access/AccessMode$Reader;Lorg/apache/johnzon/mapper/access/AccessMode$Reader;Lorg/apache/johnzon/mapper/access/FieldAndMethodAccessMode$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/access/FieldAndMethodAccessMode$CompositeReader", "<init>", "(Lorg/apache/johnzon/mapper/access/AccessMode$Reader;Lorg/apache/johnzon/mapper/access/AccessMode$Reader;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
