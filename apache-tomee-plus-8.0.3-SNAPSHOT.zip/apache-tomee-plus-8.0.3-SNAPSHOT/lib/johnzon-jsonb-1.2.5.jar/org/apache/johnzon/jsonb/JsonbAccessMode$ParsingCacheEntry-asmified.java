package asm.org.apache.johnzon.jsonb;
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
public class JsonbAccessMode$ParsingCacheEntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/jsonb/JsonbAccessMode$ParsingCacheEntry", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JsonbAccessMode$ReaderConverters", "org/apache/johnzon/jsonb/JsonbAccessMode", "ReaderConverters", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters", "org/apache/johnzon/jsonb/JsonbAccessMode", "WriterConverters", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "org/apache/johnzon/mapper/access/AccessMode", "DecoratedType", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JsonbAccessMode$ParsingCacheEntry", "org/apache/johnzon/jsonb/JsonbAccessMode", "ParsingCacheEntry", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "readers", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$ReaderConverters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "writers", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/johnzon/jsonb/JsonbAccessMode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/johnzon/jsonb/JsonbAccessMode;Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;Lorg/apache/johnzon/core/Types;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$ParsingCacheEntry", "this$0", "Lorg/apache/johnzon/jsonb/JsonbAccessMode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/jsonb/JsonbAccessMode$ReaderConverters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/JsonbAccessMode$ReaderConverters", "<init>", "(Lorg/apache/johnzon/jsonb/JsonbAccessMode;Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$ParsingCacheEntry", "readers", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$ReaderConverters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters", "<init>", "(Lorg/apache/johnzon/jsonb/JsonbAccessMode;Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;Lorg/apache/johnzon/core/Types;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$ParsingCacheEntry", "writers", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/johnzon/jsonb/JsonbAccessMode$ParsingCacheEntry;)Lorg/apache/johnzon/jsonb/JsonbAccessMode$ReaderConverters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$ParsingCacheEntry", "readers", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$ReaderConverters;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/apache/johnzon/jsonb/JsonbAccessMode$ParsingCacheEntry;)Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$ParsingCacheEntry", "writers", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
