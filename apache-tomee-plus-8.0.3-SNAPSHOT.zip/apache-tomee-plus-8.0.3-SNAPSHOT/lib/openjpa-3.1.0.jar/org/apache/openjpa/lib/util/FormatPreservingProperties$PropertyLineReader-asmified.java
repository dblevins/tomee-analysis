package asm.org.apache.openjpa.lib.util;
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
public class FormatPreservingProperties$PropertyLineReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/lib/util/FormatPreservingProperties$PropertyLineReader", null, "java/io/BufferedReader", null);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/FormatPreservingProperties$PropertySource", "org/apache/openjpa/lib/util/FormatPreservingProperties", "PropertySource", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/FormatPreservingProperties$PropertyLineReader", "org/apache/openjpa/lib/util/FormatPreservingProperties", "PropertyLineReader", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/FormatPreservingProperties$PropertyLine", "org/apache/openjpa/lib/util/FormatPreservingProperties", "PropertyLine", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/FormatPreservingProperties$LineEndingStream", "org/apache/openjpa/lib/util/FormatPreservingProperties", "LineEndingStream", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/lib/util/FormatPreservingProperties;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/lib/util/FormatPreservingProperties;Ljava/io/InputStream;Lorg/apache/openjpa/lib/util/FormatPreservingProperties$PropertySource;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/FormatPreservingProperties$PropertyLineReader", "this$0", "Lorg/apache/openjpa/lib/util/FormatPreservingProperties;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/io/InputStreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/FormatPreservingProperties$LineEndingStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/FormatPreservingProperties$LineEndingStream", "<init>", "(Ljava/io/InputStream;Lorg/apache/openjpa/lib/util/FormatPreservingProperties$PropertySource;)V", false);
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InputStreamReader", "<init>", "(Ljava/io/InputStream;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/BufferedReader", "<init>", "(Ljava/io/Reader;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readPropertyLine", "()Lorg/apache/openjpa/lib/util/FormatPreservingProperties$PropertyLine;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/FormatPreservingProperties$PropertyLineReader", "readLine", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/FormatPreservingProperties$PropertyLine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/FormatPreservingProperties$PropertyLineReader", "this$0", "Lorg/apache/openjpa/lib/util/FormatPreservingProperties;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/FormatPreservingProperties$PropertyLine", "<init>", "(Lorg/apache/openjpa/lib/util/FormatPreservingProperties;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
