package asm.org.apache.geronimo.microprofile.openapi.impl.model;
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
public class APIResponsesImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "Lorg/apache/geronimo/microprofile/openapi/impl/model/APIMap<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;>;Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;", "org/apache/geronimo/microprofile/openapi/impl/model/APIMap", new String[] { "org/eclipse/microprofile/openapi/models/responses/APIResponses" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/enterprise/inject/Vetoed;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_extensible", "Lorg/eclipse/microprofile/openapi/models/Extensible;", "Lorg/eclipse/microprofile/openapi/models/Extensible<Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/microprofile/openapi/impl/model/ExtensibleImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/openapi/impl/model/ExtensibleImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "_extensible", "Lorg/eclipse/microprofile/openapi/models/Extensible;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addAPIResponse", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;)Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "addApiResponse", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;)Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeAPIResponse", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAPIResponses", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAPIResponses", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "clear", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "putAll", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addApiResponse", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;)Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefault", "()Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/json/bind/annotation/JsonbTransient;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/responses/APIResponse");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultValue", "()Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "getDefault", "()Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultValue", "(Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "removeAPIResponse", "(Ljava/lang/String;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "addApiResponse", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;)Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "defaultValue", "(Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;)Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "setDefaultValue", "(Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExtensions", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/json/bind/annotation/JsonbTransient;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "_extensible", "Lorg/eclipse/microprofile/openapi/models/Extensible;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Extensible", "getExtensions", "()Ljava/util/Map;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addExtension", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "_extensible", "Lorg/eclipse/microprofile/openapi/models/Extensible;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Extensible", "addExtension", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/eclipse/microprofile/openapi/models/Extensible;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeExtension", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "_extensible", "Lorg/eclipse/microprofile/openapi/models/Extensible;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Extensible", "removeExtension", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExtensions", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "_extensible", "Lorg/eclipse/microprofile/openapi/models/Extensible;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Extensible", "setExtensions", "(Ljava/util/Map;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "remove", "(Ljava/lang/Object;)Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIMap", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/responses/APIResponse");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "put", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;)Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/responses/APIResponse");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(Ljava/lang/Object;)Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/responses/APIResponse");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addExtension", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/eclipse/microprofile/openapi/models/Extensible;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/openapi/impl/model/APIResponsesImpl", "addExtension", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
