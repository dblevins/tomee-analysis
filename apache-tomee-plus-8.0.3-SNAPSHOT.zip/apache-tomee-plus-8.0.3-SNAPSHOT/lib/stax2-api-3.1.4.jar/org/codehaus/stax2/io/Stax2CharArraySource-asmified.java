package asm.org.codehaus.stax2.io;
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
public class Stax2CharArraySourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/codehaus/stax2/io/Stax2CharArraySource", null, "org/codehaus/stax2/io/Stax2BlockSource", null);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "mBuffer", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "mStart", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "mLength", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([CII)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/io/Stax2BlockSource", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/io/Stax2CharArraySource", "mBuffer", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/io/Stax2CharArraySource", "mStart", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/io/Stax2CharArraySource", "mLength", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "constructReader", "()Ljava/io/Reader;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/CharArrayReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/io/Stax2CharArraySource", "mBuffer", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/io/Stax2CharArraySource", "mStart", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/io/Stax2CharArraySource", "mLength", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/CharArrayReader", "<init>", "([CII)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "constructInputStream", "()Ljava/io/InputStream;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBuffer", "()[C", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/io/Stax2CharArraySource", "mBuffer", "[C");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBufferStart", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/io/Stax2CharArraySource", "mStart", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBufferLength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/io/Stax2CharArraySource", "mLength", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
