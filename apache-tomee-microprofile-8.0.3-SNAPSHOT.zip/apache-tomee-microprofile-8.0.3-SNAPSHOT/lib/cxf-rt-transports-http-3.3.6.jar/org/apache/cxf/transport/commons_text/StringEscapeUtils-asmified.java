package asm.org.apache.cxf.transport.commons_text;
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
public class StringEscapeUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/transport/commons_text/StringEscapeUtils", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ESCAPE_HTML4", "Lorg/apache/cxf/transport/commons_text/CharSequenceTranslator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "escapeHtml4", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/commons_text/StringEscapeUtils", "ESCAPE_HTML4", "Lorg/apache/cxf/transport/commons_text/CharSequenceTranslator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/commons_text/CharSequenceTranslator", "translate", "(Ljava/lang/CharSequence;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/commons_text/AggregateTranslator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/transport/commons_text/CharSequenceTranslator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/commons_text/LookupTranslator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/commons_text/EntityArrays", "BASIC_ESCAPE", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/commons_text/LookupTranslator", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/commons_text/LookupTranslator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/commons_text/EntityArrays", "ISO8859_1_ESCAPE", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/commons_text/LookupTranslator", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/commons_text/LookupTranslator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/commons_text/EntityArrays", "HTML40_EXTENDED_ESCAPE", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/commons_text/LookupTranslator", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/commons_text/AggregateTranslator", "<init>", "([Lorg/apache/cxf/transport/commons_text/CharSequenceTranslator;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/transport/commons_text/StringEscapeUtils", "ESCAPE_HTML4", "Lorg/apache/cxf/transport/commons_text/CharSequenceTranslator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
