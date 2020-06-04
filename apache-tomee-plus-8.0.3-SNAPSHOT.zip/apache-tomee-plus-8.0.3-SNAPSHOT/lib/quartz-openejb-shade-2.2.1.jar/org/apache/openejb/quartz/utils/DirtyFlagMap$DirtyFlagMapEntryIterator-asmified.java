package asm.org.apache.openejb.quartz.utils;
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
public class DirtyFlagMap$DirtyFlagMapEntryIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagMapEntryIterator", "Lorg/apache/openejb/quartz/utils/DirtyFlagMap<TK;TV;>.DirtyFlagIterator<Ljava/util/Map$Entry<TK;TV;>;>;", "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagIterator", null);

classWriter.visitInnerClass("org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagMapEntryIterator", "org/apache/openejb/quartz/utils/DirtyFlagMap", "DirtyFlagMapEntryIterator", ACC_PRIVATE);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagMapEntry", "org/apache/openejb/quartz/utils/DirtyFlagMap", "DirtyFlagMapEntry", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagIterator", "org/apache/openejb/quartz/utils/DirtyFlagMap", "DirtyFlagIterator", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/quartz/utils/DirtyFlagMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/quartz/utils/DirtyFlagMap;Ljava/util/Iterator;)V", "(Ljava/util/Iterator<Ljava/util/Map$Entry<TK;TV;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagMapEntryIterator", "this$0", "Lorg/apache/openejb/quartz/utils/DirtyFlagMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagIterator", "<init>", "(Lorg/apache/openejb/quartz/utils/DirtyFlagMap;Ljava/util/Iterator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagMapEntry;", "()Lorg/apache/openejb/quartz/utils/DirtyFlagMap<TK;TV;>.DirtyFlagMapEntry;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagMapEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagMapEntryIterator", "this$0", "Lorg/apache/openejb/quartz/utils/DirtyFlagMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagIterator", "next", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagMapEntry", "<init>", "(Lorg/apache/openejb/quartz/utils/DirtyFlagMap;Ljava/util/Map$Entry;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagMapEntryIterator", "next", "()Lorg/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagMapEntry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
