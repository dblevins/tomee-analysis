package asm.org.apache.openejb.api.jmx;
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
public class NotificationInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/api/jmx/NotificationInfo", null, "java/lang/Object", new String[] { "java/lang/annotation/Annotation" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Documented;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Inherited;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Target;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "TYPE");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Retention;", true);
annotationVisitor0.visitEnum("value", "Ljava/lang/annotation/RetentionPolicy;", "RUNTIME");
annotationVisitor0.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "types", "()[Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray(null);
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "description", "()Lorg/apache/openejb/api/jmx/Description;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitAnnotation(null, "Lorg/apache/openejb/api/jmx/Description;");
annotationVisitor1.visit("value", "");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notificationClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Ljavax/management/Notification;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visit(null, Type.getType("Ljavax/management/Notification;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "descriptorFields", "()[Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray(null);
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
