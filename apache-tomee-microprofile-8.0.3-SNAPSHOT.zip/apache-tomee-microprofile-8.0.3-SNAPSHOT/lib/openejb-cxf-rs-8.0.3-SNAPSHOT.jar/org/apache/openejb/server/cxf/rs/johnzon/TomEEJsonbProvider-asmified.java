package asm.org.apache.openejb.server.cxf.rs.johnzon;
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
public class TomEEJsonbProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbProvider", "<T:Ljava/lang/Object;>Lorg/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider<TT;>;", "org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/ext/Provider;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/Produces;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, "application/json");
annotationVisitor1.visit(null, "application/*+json");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/Consumes;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, "application/json");
annotationVisitor1.visit(null, "application/*+json");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbProvider", "config", "Ljavax/json/bind/JsonbConfig;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbPropertyVisibilityStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbPropertyVisibilityStrategy", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/bind/JsonbConfig", "withPropertyVisibilityStrategy", "(Ljavax/json/bind/config/PropertyVisibilityStrategy;)Ljavax/json/bind/JsonbConfig;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDateFormat", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbProvider", "config", "Ljavax/json/bind/JsonbConfig;");
methodVisitor.visitLdcInsn("jsonb.date-format");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/bind/JsonbConfig", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/json/bind/JsonbConfig;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLocale", "(Ljava/util/Locale;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbProvider", "config", "Ljavax/json/bind/JsonbConfig;");
methodVisitor.visitLdcInsn("jsonb.locale");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/bind/JsonbConfig", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/json/bind/JsonbConfig;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAccessMode", "(Lorg/apache/johnzon/mapper/access/AccessMode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbProvider", "config", "Ljavax/json/bind/JsonbConfig;");
methodVisitor.visitLdcInsn("johnzon.accessMode");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/bind/JsonbConfig", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/json/bind/JsonbConfig;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
