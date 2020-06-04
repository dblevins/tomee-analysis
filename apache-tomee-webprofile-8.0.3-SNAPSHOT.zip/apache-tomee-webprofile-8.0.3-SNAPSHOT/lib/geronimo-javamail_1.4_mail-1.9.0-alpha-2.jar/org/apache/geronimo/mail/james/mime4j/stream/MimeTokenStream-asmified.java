package asm.org.apache.geronimo.mail.james.mime4j.stream;
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
public class MimeTokenStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "config", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "monitor", "Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "fieldBuilder", "Lorg/apache/geronimo/mail/james/mime4j/stream/FieldBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "bodyDescBuilder", "Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "entities", "Ljava/util/LinkedList;", "Ljava/util/LinkedList<Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "state", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "recursionMode", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rootentity", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeEntity;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;Lorg/apache/geronimo/mail/james/mime4j/stream/FieldBuilder;Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;Lorg/apache/geronimo/mail/james/mime4j/stream/FieldBuilder;Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;Lorg/apache/geronimo/mail/james/mime4j/stream/FieldBuilder;Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;Lorg/apache/geronimo/mail/james/mime4j/stream/FieldBuilder;Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "entities", "Ljava/util/LinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/EntityState", "T_END_OF_STREAM", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "state", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/RecursionMode", "M_RECURSE", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "recursionMode", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig", "<init>", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "config", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/stream/DefaultFieldBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "config", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig", "getMaxHeaderLen", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/DefaultFieldBuilder", "<init>", "(I)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "fieldBuilder", "Lorg/apache/geronimo/mail/james/mime4j/stream/FieldBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "config", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig", "isStrictParsing", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor", "STRICT", "Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;");
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor", "SILENT", "Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "monitor", "Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/stream/FallbackBodyDescriptorBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/FallbackBodyDescriptorBuilder", "<init>", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "bodyDescBuilder", "Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/io/InputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/EntityState", "T_START_MESSAGE", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "doParse", "(Ljava/io/InputStream;Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parseHeadless", "(Ljava/io/InputStream;Ljava/lang/String;)Lorg/apache/geronimo/mail/james/mime4j/stream/Field;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/geronimo/mail/james/mime4j/MimeException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/io/IOException");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label6, "org/apache/geronimo/mail/james/mime4j/MimeException");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Content type may not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/stream/RawField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Content-Type");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/RawField", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "bodyDescBuilder", "Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder", "addField", "(Lorg/apache/geronimo/mail/james/mime4j/stream/RawField;)Lorg/apache/geronimo/mail/james/mime4j/stream/Field;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/MimeException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/EntityState", "T_END_HEADER", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "doParse", "(Ljava/io/InputStream;Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "next", "()Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "doParse", "(Ljava/io/InputStream;Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "config", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig", "isCountLineNumbers", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/io/LineNumberInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/io/LineNumberInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/stream/MimeEntity");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "config", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/EntityState", "T_END_MESSAGE", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "monitor", "Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "fieldBuilder", "Lorg/apache/geronimo/mail/james/mime4j/stream/FieldBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "bodyDescBuilder", "Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeEntity", "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/io/LineNumberSource;Ljava/io/InputStream;Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;Lorg/apache/geronimo/mail/james/mime4j/stream/FieldBuilder;Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "rootentity", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeEntity;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "rootentity", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeEntity;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "recursionMode", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeEntity", "setRecursionMode", "(Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "rootentity", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeEntity;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "entities", "Ljava/util/LinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "clear", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "entities", "Ljava/util/LinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine", "getState", "()Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "state", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRaw", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "recursionMode", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/RecursionMode", "M_RAW", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRecursionMode", "()Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "recursionMode", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRecursionMode", "(Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "recursionMode", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine", "setRecursionMode", "(Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "rootentity", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeEntity;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeEntity", "stop", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getState", "()Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "state", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInputStream", "()Ljava/io/InputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine", "getContentStream", "()Ljava/io/InputStream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDecodedInputStream", "()Ljava/io/InputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine", "getDecodedContentStream", "()Ljava/io/InputStream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReader", "()Ljava/io/Reader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getBodyDescriptor", "()Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptor;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/stream/BodyDescriptor", "getCharset", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/util/CharsetUtil", "US_ASCII", "Ljava/nio/charset/Charset;");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/Charset", "forName", "(Ljava/lang/String;)Ljava/nio/charset/Charset;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getDecodedInputStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/io/InputStreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InputStreamReader", "<init>", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBodyDescriptor", "()Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine", "getBodyDescriptor", "()Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptor;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getField", "()Lorg/apache/geronimo/mail/james/mime4j/stream/Field;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine", "getField", "()Lorg/apache/geronimo/mail/james/mime4j/stream/Field;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;", null, new String[] { "java/io/IOException", "org/apache/geronimo/mail/james/mime4j/MimeException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "state", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/EntityState", "T_END_OF_STREAM", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No more tokens are available.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine", "advance", "()Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "entities", "Ljava/util/LinkedList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine", "getState", "()Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "state", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "state", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/EntityState", "T_END_OF_STREAM", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "state", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "entities", "Ljava/util/LinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "removeLast", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "entities", "Ljava/util/LinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "isEmpty", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "entities", "Ljava/util/LinkedList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "getLast", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "currentStateMachine", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "recursionMode", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/stream/EntityStateMachine", "setRecursionMode", "(Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/EntityState", "T_END_OF_STREAM", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "state", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "state", "Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "stateToString", "(Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/mail/james/mime4j/stream/MimeEntity", "stateToString", "(Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConfig", "()Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "config", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
