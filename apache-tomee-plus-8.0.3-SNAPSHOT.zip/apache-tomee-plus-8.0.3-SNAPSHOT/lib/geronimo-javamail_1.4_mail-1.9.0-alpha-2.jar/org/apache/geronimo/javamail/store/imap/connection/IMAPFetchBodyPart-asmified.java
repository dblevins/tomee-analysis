package asm.org.apache.geronimo.javamail.store.imap.connection;
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
public class IMAPFetchBodyPartDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/javamail/store/imap/connection/IMAPFetchBodyPart", null, "org/apache/geronimo/javamail/store/imap/connection/IMAPFetchDataItem", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "section", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodySection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(ILorg/apache/geronimo/javamail/store/imap/connection/IMAPBodySection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/imap/connection/IMAPFetchDataItem", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPFetchBodyPart", "section", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodySection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPartNumber", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPFetchBodyPart", "section", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodySection;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodySection", "partNumber", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSectionType", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPFetchBodyPart", "section", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodySection;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodySection", "section", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubstringStart", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPFetchBodyPart", "section", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodySection;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodySection", "start", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubstringLength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPFetchBodyPart", "section", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodySection;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodySection", "length", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
