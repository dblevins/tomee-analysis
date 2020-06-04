package asm.io.opentracing.propagation;
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
public class Format$BuiltinDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "io/opentracing/propagation/Format$Builtin", "<C:Ljava/lang/Object;>Ljava/lang/Object;Lio/opentracing/propagation/Format<TC;>;", "java/lang/Object", new String[] { "io/opentracing/propagation/Format" });

classWriter.visitInnerClass("io/opentracing/propagation/Format$Builtin", "io/opentracing/propagation/Format", "Builtin", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TEXT_MAP", "Lio/opentracing/propagation/Format;", "Lio/opentracing/propagation/Format<Lio/opentracing/propagation/TextMap;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_HEADERS", "Lio/opentracing/propagation/Format;", "Lio/opentracing/propagation/Format<Lio/opentracing/propagation/TextMap;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BINARY", "Lio/opentracing/propagation/Format;", "Lio/opentracing/propagation/Format<Ljava/nio/ByteBuffer;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "io/opentracing/propagation/Format$Builtin", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Lio/opentracing/propagation/Format$Builtin;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "io/opentracing/propagation/Format$Builtin", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "io/opentracing/propagation/Format$Builtin");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TEXT_MAP");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/propagation/Format$Builtin", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/propagation/Format$Builtin", "TEXT_MAP", "Lio/opentracing/propagation/Format;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/propagation/Format$Builtin");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HTTP_HEADERS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/propagation/Format$Builtin", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/propagation/Format$Builtin", "HTTP_HEADERS", "Lio/opentracing/propagation/Format;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/propagation/Format$Builtin");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINARY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/propagation/Format$Builtin", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/propagation/Format$Builtin", "BINARY", "Lio/opentracing/propagation/Format;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
