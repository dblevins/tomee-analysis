package asm.com.ctc.wstx.sax;
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
public class SAXPropertyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/ctc/wstx/sax/SAXProperty", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STD_PROPERTY_PREFIX", "Ljava/lang/String;", null, "http://xml.org/sax/properties/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "sInstances", "Ljava/util/HashMap;", "Ljava/util/HashMap<Ljava/lang/String;Lcom/ctc/wstx/sax/SAXProperty;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DECLARATION_HANDLER", "Lcom/ctc/wstx/sax/SAXProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOCUMENT_XML_VERSION", "Lcom/ctc/wstx/sax/SAXProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOM_NODE", "Lcom/ctc/wstx/sax/SAXProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LEXICAL_HANDLER", "Lcom/ctc/wstx/sax/SAXProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "XML_STRING", "Lcom/ctc/wstx/sax/SAXProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mSuffix", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/sax/SAXProperty", "mSuffix", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/sax/SAXProperty", "sInstances", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findByUri", "(Ljava/lang/String;)Lcom/ctc/wstx/sax/SAXProperty;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://xml.org/sax/properties/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://xml.org/sax/properties/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/sax/SAXProperty", "findBySuffix", "(Ljava/lang/String;)Lcom/ctc/wstx/sax/SAXProperty;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findBySuffix", "(Ljava/lang/String;)Lcom/ctc/wstx/sax/SAXProperty;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/sax/SAXProperty", "sInstances", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/ctc/wstx/sax/SAXProperty");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSuffix", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sax/SAXProperty", "mSuffix", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("http://xml.org/sax/properties/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sax/SAXProperty", "mSuffix", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXProperty", "sInstances", "Ljava/util/HashMap;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("declaration-handler");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXProperty", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXProperty", "DECLARATION_HANDLER", "Lcom/ctc/wstx/sax/SAXProperty;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("document-xml-version");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXProperty", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXProperty", "DOCUMENT_XML_VERSION", "Lcom/ctc/wstx/sax/SAXProperty;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dom-node");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXProperty", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXProperty", "DOM_NODE", "Lcom/ctc/wstx/sax/SAXProperty;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("lexical-handler");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXProperty", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXProperty", "LEXICAL_HANDLER", "Lcom/ctc/wstx/sax/SAXProperty;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("xml-string");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXProperty", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXProperty", "XML_STRING", "Lcom/ctc/wstx/sax/SAXProperty;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
