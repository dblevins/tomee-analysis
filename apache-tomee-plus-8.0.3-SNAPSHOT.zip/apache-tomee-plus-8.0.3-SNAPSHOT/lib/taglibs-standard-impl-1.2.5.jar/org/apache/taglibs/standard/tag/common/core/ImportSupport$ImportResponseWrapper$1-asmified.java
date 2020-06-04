package asm.org.apache.taglibs.standard.tag.common.core;
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
public class ImportSupport$ImportResponseWrapper$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper$1", null, "javax/servlet/ServletOutputStream", null);

classWriter.visitOuterClass("org/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper", null, null);

classWriter.visitInnerClass("org/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper", "org/apache/taglibs/standard/tag/common/core/ImportSupport", "ImportResponseWrapper", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper$1", "this$1", "Lorg/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/ServletOutputStream", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper$1", "this$1", "Lorg/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper", "access$000", "(Lorg/apache/taglibs/standard/tag/common/core/ImportSupport$ImportResponseWrapper;)Ljava/io/ByteArrayOutputStream;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "write", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
