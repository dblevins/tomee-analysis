package asm.com.sun.faces.facelets.tag;
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
public class DefaultTagDecorator$MapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "Ljava/lang/Enum<Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "com/sun/faces/facelets/tag/DefaultTagDecorator", "Mapper", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "com/sun/faces/facelets/tag/DefaultTagDecorator", "ElementConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/DefaultTagDecorator$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "a", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "img", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "body", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "head", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "label", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "script", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "link", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "form", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "textarea", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "button", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "select", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "input", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "elementConverter", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "$VALUES", "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_VARARGS, "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;)V", "([Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "elementConverter", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "java/lang/String", Opcodes.INTEGER, "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper$1", "<init>", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "elementConverter", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "<init>", "(Ljava/lang/String;Lcom/sun/faces/facelets/tag/DefaultTagDecorator$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "elementConverter", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "elementConverter", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("a");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("h:commandLink");
methodVisitor.visitLdcInsn("jsf:action");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sun/faces/facelets/tag/DefaultTagDecorator$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("h:commandLink");
methodVisitor.visitLdcInsn("jsf:actionListener");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sun/faces/facelets/tag/DefaultTagDecorator$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("h:outputLink");
methodVisitor.visitLdcInsn("jsf:value");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sun/faces/facelets/tag/DefaultTagDecorator$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("h:link");
methodVisitor.visitLdcInsn("jsf:outcome");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sun/faces/facelets/tag/DefaultTagDecorator$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "a", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("img");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("h:graphicImage");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "img", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("body");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("h:body");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "body", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("head");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("h:head");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "head", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("label");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("h:outputLabel");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "label", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("script");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("h:outputScript");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "script", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("link");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("h:outputStylesheet");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "link", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("form");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("h:form");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "form", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("textarea");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("h:inputTextarea");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "textarea", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("button");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("h:button");
methodVisitor.visitLdcInsn("jsf:outcome");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sun/faces/facelets/tag/DefaultTagDecorator$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("h:commandButton");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "<init>", "(Ljava/lang/String;Lcom/sun/faces/facelets/tag/DefaultTagDecorator$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "button", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("select");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("h:selectManyListbox");
methodVisitor.visitLdcInsn("multiple");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sun/faces/facelets/tag/DefaultTagDecorator$1;)V", false);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$200", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("h:selectOneListbox");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "<init>", "(Ljava/lang/String;Lcom/sun/faces/facelets/tag/DefaultTagDecorator$1;)V", false);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$200", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "select", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("input");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("h:inputText");
methodVisitor.visitLdcInsn("type");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sun/faces/facelets/tag/DefaultTagDecorator$1;)V", false);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$200", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("hidden");
methodVisitor.visitLdcInsn("inputHidden");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("password");
methodVisitor.visitLdcInsn("inputSecret");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("number");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("search");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("email");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("datetime");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("date");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("month");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("week");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("time");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("datetime-local");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("range");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("color");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("url");
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("checkbox");
methodVisitor.visitLdcInsn("selectBooleanCheckbox");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("file");
methodVisitor.visitLdcInsn("inputFile");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("submit");
methodVisitor.visitLdcInsn("commandButton");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("reset");
methodVisitor.visitLdcInsn("commandButton");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitLdcInsn("button");
methodVisitor.visitLdcInsn("button");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "access$300", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;Ljava/lang/String;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "input", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "a", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "img", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "body", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "head", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "label", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "script", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "link", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "form", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "textarea", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "button", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "select", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "input", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "$VALUES", "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(12, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
