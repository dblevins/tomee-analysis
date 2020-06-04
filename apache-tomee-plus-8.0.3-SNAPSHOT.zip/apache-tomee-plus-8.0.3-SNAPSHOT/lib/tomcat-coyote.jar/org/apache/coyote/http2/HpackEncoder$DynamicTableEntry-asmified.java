package asm.org.apache.coyote.http2;
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
public class HpackEncoder$DynamicTableEntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/coyote/http2/HpackEncoder$DynamicTableEntry", null, "org/apache/coyote/http2/HpackEncoder$TableEntry", null);

classWriter.visitInnerClass("org/apache/coyote/http2/HpackEncoder$DynamicTableEntry", "org/apache/coyote/http2/HpackEncoder", "DynamicTableEntry", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/coyote/http2/HpackEncoder$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/coyote/http2/HpackEncoder$TableEntry", "org/apache/coyote/http2/HpackEncoder", "TableEntry", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/coyote/http2/HpackEncoder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/coyote/http2/HpackEncoder;Ljava/lang/String;Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/HpackEncoder$DynamicTableEntry", "this$0", "Lorg/apache/coyote/http2/HpackEncoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/HpackEncoder$TableEntry", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILorg/apache/coyote/http2/HpackEncoder$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getPosition", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/HpackEncoder$TableEntry", "getPosition", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/HpackEncoder$DynamicTableEntry", "this$0", "Lorg/apache/coyote/http2/HpackEncoder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http2/HpackEncoder", "access$600", "(Lorg/apache/coyote/http2/HpackEncoder;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Hpack", "STATIC_TABLE_LENGTH", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/coyote/http2/HpackEncoder;Ljava/lang/String;Ljava/lang/String;ILorg/apache/coyote/http2/HpackEncoder$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/HpackEncoder$DynamicTableEntry", "<init>", "(Lorg/apache/coyote/http2/HpackEncoder;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
