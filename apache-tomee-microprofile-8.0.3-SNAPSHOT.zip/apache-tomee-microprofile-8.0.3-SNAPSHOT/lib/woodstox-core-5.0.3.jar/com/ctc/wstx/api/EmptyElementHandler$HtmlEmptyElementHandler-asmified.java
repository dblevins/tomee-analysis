package asm.com.ctc.wstx.api;
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
public class EmptyElementHandler$HtmlEmptyElementHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", null, "com/ctc/wstx/api/EmptyElementHandler$SetEmptyElementHandler", null);

classWriter.visitInnerClass("com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "com/ctc/wstx/api/EmptyElementHandler", "HtmlEmptyElementHandler", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/ctc/wstx/api/EmptyElementHandler$SetEmptyElementHandler", "com/ctc/wstx/api/EmptyElementHandler", "SetEmptyElementHandler", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "sInstance", "Lcom/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "()Lcom/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "sInstance", "Lcom/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/TreeSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/String", "CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TreeSet", "<init>", "(Ljava/util/Comparator;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/EmptyElementHandler$SetEmptyElementHandler", "<init>", "(Ljava/util/Set;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("area");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("base");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("basefont");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("br");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("col");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("frame");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("hr");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("input");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("img");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("isindex");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("link");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("meta");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "mEmptyElements", "Ljava/util/Set;");
methodVisitor.visitLdcInsn("param");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler", "sInstance", "Lcom/ctc/wstx/api/EmptyElementHandler$HtmlEmptyElementHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
