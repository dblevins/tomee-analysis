package asm.com.sun.faces.facelets.tag.composite;
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
public class PropertyHandlerManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$BooleanValueExpressionPropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "BooleanValueExpressionPropertyHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$DisplayNamePropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "DisplayNamePropertyHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ExpertPropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ExpertPropertyHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$HiddenPropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "HiddenPropertyHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$PreferredPropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "PreferredPropertyHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ComponentTypePropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ComponentTypePropertyHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$DefaultPropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "DefaultPropertyHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ObjectValueExpressionPropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ObjectValueExpressionPropertyHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$StringValueExpressionPropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "StringValueExpressionPropertyHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ShortDescriptionPropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ShortDescriptionPropertyHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$NamePropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "NamePropertyHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$TypedValueExpressionPropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "TypedValueExpressionPropertyHandler", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$StringFeatureDescriptorPropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "StringFeatureDescriptorPropertyHandler", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/composite/PropertyHandlerManager$BooleanFeatureDescriptorPropertyHandler", "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "BooleanFeatureDescriptorPropertyHandler", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ALL_HANDLERS", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lcom/sun/faces/facelets/tag/composite/PropertyHandler;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEV_ONLY_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "managedHandlers", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lcom/sun/faces/facelets/tag/composite/PropertyHandler;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "genericHandler", "Lcom/sun/faces/facelets/tag/composite/PropertyHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Lcom/sun/faces/facelets/tag/composite/PropertyHandler;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ObjectValueExpressionPropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ObjectValueExpressionPropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "genericHandler", "Lcom/sun/faces/facelets/tag/composite/PropertyHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "managedHandlers", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getInstance", "([Ljava/lang/String;)Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(FCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(IF)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"[Ljava/lang/String;", "java/util/Map", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getHandler", "(Ljavax/faces/view/facelets/FaceletContext;Ljava/lang/String;)Lcom/sun/faces/facelets/tag/composite/PropertyHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/FaceletContext", "getFacesContext", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/application/ProjectStage", "Development", "Ljavax/faces/application/ProjectStage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "isProjectStage", "(Ljavax/faces/application/ProjectStage;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "DEV_ONLY_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "binarySearch", "([Ljava/lang/Object;Ljava/lang/Object;)I", false);
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "managedHandlers", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/facelets/tag/composite/PropertyHandler");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/faces/facelets/tag/composite/PropertyHandler"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "genericHandler", "Lcom/sun/faces/facelets/tag/composite/PropertyHandler;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/faces/facelets/tag/composite/PropertyHandler"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(FCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(IF)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("targets");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$StringValueExpressionPropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$StringValueExpressionPropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("targetAttributeName");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$StringValueExpressionPropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$StringValueExpressionPropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("method-signature");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$StringValueExpressionPropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$StringValueExpressionPropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("type");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$StringValueExpressionPropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$StringValueExpressionPropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("default");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$DefaultPropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$DefaultPropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("displayName");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$DisplayNamePropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$DisplayNamePropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("shortDescription");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ShortDescriptionPropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ShortDescriptionPropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("expert");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ExpertPropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ExpertPropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("hidden");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$HiddenPropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$HiddenPropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("preferred");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$PreferredPropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$PreferredPropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("required");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$BooleanValueExpressionPropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$BooleanValueExpressionPropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("name");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$NamePropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$NamePropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "ALL_HANDLERS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("componentType");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ComponentTypePropertyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager$ComponentTypePropertyHandler", "<init>", "(Lcom/sun/faces/facelets/tag/composite/PropertyHandlerManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("displayName");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("shortDescription");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("export");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("hidden");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("preferred");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "DEV_ONLY_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/composite/PropertyHandlerManager", "DEV_ONLY_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "sort", "([Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
