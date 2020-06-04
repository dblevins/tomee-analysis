package asm.org.apache.geronimo.mail.james.mime4j.parser;
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
public class MimeStreamParserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser$1", "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "contentDecoding", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "contentDecoding", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig", "clone", "()Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig", "<init>", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig", "<init>", "()V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;Lorg/apache/geronimo/mail/james/mime4j/codec/DecodeMonitor;Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptorBuilder;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "<init>", "(Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isContentDecoding", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "contentDecoding", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContentDecoding", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "contentDecoding", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/io/InputStream;)V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getConfig", "()Lorg/apache/geronimo/mail/james/mime4j/stream/MimeConfig;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig", "getHeadlessParsing", "()Ljava/lang/String;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeConfig", "getHeadlessParsing", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "parseHeadless", "(Ljava/io/InputStream;Ljava/lang/String;)Lorg/apache/geronimo/mail/james/mime4j/stream/Field;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "startMessage", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "startHeader", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "field", "(Lorg/apache/geronimo/mail/james/mime4j/stream/Field;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "endHeader", "()V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "parse", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getState", "()Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser$1", "$SwitchMap$org$apache$james$mime4j$stream$EntityState", "[I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/EntityState", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
methodVisitor.visitTableSwitchInsn(1, 14, label16, new Label[] { label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15 });
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getBodyDescriptor", "()Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptor;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "contentDecoding", "Z");
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getDecodedInputStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label18 = new Label();
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label17);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getInputStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label18);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "body", "(Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptor;Ljava/io/InputStream;)V", true);
Label label19 = new Label();
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "endBodyPart", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "endHeader", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "endMessage", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "endMultipart", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label7);
Label label20 = new Label();
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getInputStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "epilogue", "(Ljava/io/InputStream;)V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getField", "()Lorg/apache/geronimo/mail/james/mime4j/stream/Field;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "field", "(Lorg/apache/geronimo/mail/james/mime4j/stream/Field;)V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getInputStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "preamble", "(Ljava/io/InputStream;)V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getInputStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "raw", "(Ljava/io/InputStream;)V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "startBodyPart", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "startHeader", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label14);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "startMessage", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label15);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "getBodyDescriptor", "()Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", "startMultipart", "(Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptor;)V", true);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label16);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Invalid state: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label19);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "next", "()Lorg/apache/geronimo/mail/james/mime4j/stream/EntityState;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label20);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRaw", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "isRaw", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRaw", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/RecursionMode", "M_RAW", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "setRecursionMode", "(Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFlat", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/RecursionMode", "M_FLAT", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "setRecursionMode", "(Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRecurse", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/stream/RecursionMode", "M_RECURSE", "Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "setRecursionMode", "(Lorg/apache/geronimo/mail/james/mime4j/stream/RecursionMode;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "mimeTokenStream", "Lorg/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/mail/james/mime4j/stream/MimeTokenStream", "stop", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContentHandler", "(Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/mail/james/mime4j/parser/MimeStreamParser", "handler", "Lorg/apache/geronimo/mail/james/mime4j/parser/ContentHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
