package asm.org.apache.wss4j.common.bsp;
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
public class BSPRuleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/wss4j/common/bsp/BSPRule", "Ljava/lang/Enum<Lorg/apache/wss4j/common/bsp/BSPRule;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3203", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3224", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3221", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3222", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3220", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3229", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3213", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3215", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3225", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3226", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3217", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3223", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3227", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3061", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3074", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3057", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3064", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3059", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3058", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3062", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3027", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3054", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3063", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3070", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3071", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3060", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3025", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3056", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3022", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3023", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5204", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5205", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3066", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3067", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3024", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3211", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3102", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3104", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3103", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3001", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3003", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3004", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3005", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3002", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5416", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5411", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5423", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5412", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5407", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5413", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3065", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5404", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5406", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5414", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5415", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5405", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5408", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5420", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5421", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5401", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5402", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5417", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5403", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5440", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5441", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3228", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3299", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3230", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3232", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3205", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3231", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3214", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3208", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3209", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5622", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5623", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5602", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5603", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5629", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5624", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5627", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5601", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5424", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5426", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5608", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3006", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5613", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3007", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5620", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5621", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5625", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5626", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5614", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5606", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3029", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3030", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3031", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3032", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4222", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4201", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4212", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4216", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4217", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4218", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4223", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4225", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4220", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4221", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4214", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R4215", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3033", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5201", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5202", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5211", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5218", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5212", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5213", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5214", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5215", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5216", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5209", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5206", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5208", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5210", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R5409", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6304", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6301", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6302", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6902", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6903", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6904", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6907", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6906", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6905", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6601", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6611", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6617", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6614", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6602", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6609", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6603", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6616", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6604", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6605", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6610", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6612", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6606", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6607", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6608", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R6613", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3069", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "R3072", "Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "msg", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "$VALUES", "[Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/wss4j/common/bsp/BSPRule;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/wss4j/common/bsp/BSPRule;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/common/bsp/BSPRule;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
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
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/bsp/BSPRule", "msg", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMsg", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/bsp/BSPRule", "msg", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3203");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("A TIMESTAMP MUST contain exactly one CREATED");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3203", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3224");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("Any TIMESTAMP MUST NOT contain more than one EXPIRES");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3224", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3221");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Any TIMESTAMP containing an EXPIRES MUST contain a CREATED that precedes its sibling EXPIRES");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3221", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3222");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Any TIMESTAMP MUST NOT contain anything other than CREATED or EXPIRES elements");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3222", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3220");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("Any CREATED SHOULD NOT contain a seconds value with more than three digits to the right of the decimal (milliseconds)");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3220", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3229");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("Any EXPIRES SHOULD NOT contain a seconds value with more than three digits to the right of the decimal (milliseconds)");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3229", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3213");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("Any CREATED containing second values MUST specify seconds values less than 60");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3213", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3215");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("Any EXPIRES containing second values MUST specify seconds values less than 60");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3215", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3225");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("Any CREATED MUST NOT include a ValueType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3225", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3226");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("Any EXPIRES MUST NOT include a ValueType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3226", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3217");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("Any CREATED MUST contain time values in UTC format as specified by the XML Schema type (dateTime)");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3217", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3223");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("Any EXPIRES MUST contain time values in UTC format as specified by the XML Schema type (dateTime)");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3223", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3227");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("A SECURITY_HEADER MUST NOT contain more than one TIMESTAMP");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3227", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3061");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("A SECURITY_TOKEN_REFERENCE MUST provide exactly one token reference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3061", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3074");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("Any wsse:11:TokenType Attribute in a SECURITY_TOKEN_REFERENCE MUST specify a value that a TokenType specified by a security token profile for the referenced SECURITY_TOKEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3074", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3057");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("Any STR_REFERENCE MUST NOT reference a SECURITY_TOKEN_REFERENCE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3057", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3064");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("Any STR_REFERENCE MUST NOT reference an STR_EMBEDDED");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3064", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3059");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("Any STR_REFERENCE MUST specify a ValueType attribute with the exception of STR_REFERENCE pointing to a SAML_V2_0_TOKEN or a KERBEROS_TOKEN or an ENCRYPTED_KEY_TOKEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3059", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3058");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("Any STR_REFERENCE ValueType attribute MUST contain a value for the referenced SECURITY_TOKEN specified by the corresponding security token profile");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3058", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3062");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn("Any STR_REFERENCE MUST specify a URI attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3062", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3027");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE MUST NOT contain an STR_KEY_NAME");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3027", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3054");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER MUST specify a ValueType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3054", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3063");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER ValueType attribute MUST contain a value specified within the security token profile associated with the referenced SECURITY_TOKEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3063", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3070");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER that refers to a SECURITY_TOKEN other than a SAML_TOKEN MUST specify an EncodingType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3070", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3071");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER EncodingType attribute MUST have a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3071", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3060");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitLdcInsn("Any STR_EMBEDDED MUST contain only a single child element which is an INTERNAL_SECURITY_TOKEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3060", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3025");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitLdcInsn("Any INTERNAL_SECURITY_TOKEN contained in an STR_EMBEDDED MUST be in the same format as if it were a child of a SECURITY_HEADER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3025", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3056");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitLdcInsn("Any STR_EMBEDDED MUST NOT contain a wsse:SecurityTokenReference child element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3056", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3022");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE that references an INTERNAL_SECURITY_TOKEN which has a wsu:Id attribute MUST contain an STR_REFERENCE or STR_EMBEDDED");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3022", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3023");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE that references an INTERNAL_SECURITY_TOKEN that is referenced several times SHOULD contain an STR_REFERENCE rather than an STR_EMBEDDED");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3023", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5204");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitLdcInsn("Any STR_REFERENCE to an INTERNAL_SECURITY_TOKEN having an ID attribute MUST contain a URI attribute with a Shorthand XPointer value");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5204", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5205");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitLdcInsn("Any INTERNAL_SECURITY_TOKEN that is not contained in an STR_EMBEDDED MUST precede all SECURITY_TOKEN_REFERENCE elements that reference it in the SOAP_ENVELOPE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5205", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3066");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitLdcInsn("Any STR_REFERENCE that is a descendant of a SECURITY_HEADER MUST NOT use a Shorthand XPointer to refer to an INTERNAL_SECURITY_TOKEN located in a SECURITY_HEADER other than the SECURITY_HEADER that contains the STR_REFERENCE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3066", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3067");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitLdcInsn("Any STR_REFERENCE that is a descendant of an ENCRYPTED_DATA MUST NOT use a Shorthand XPointer to refer to an INTERNAL_SECURITY_TOKEN located in a SECURITY_HEADER other than the SECURITY_HEADER containing a reference (EK_REFERENCE_LIST or an ENC_REFERENCE_LIST) to the ENCRYPTED_DATA");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3067", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3024");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitLdcInsn("Any EXTERNAL_TOKEN_REFERENCE that can use an STR_REFERENCE MUST contain an STR_REFERENCE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3024", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3211");
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE MUST NOT reference a ds:KeyInfo element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3211", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3102");
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitLdcInsn("A SIGNATURE MUST NOT be an Enveloping Signature as defined by the XML Signature specification");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3102", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3104");
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitLdcInsn("A SIGNATURE SHOULD NOT be an Enveloped Signature as defined by the XML Signature specification");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3104", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3103");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitLdcInsn("A SIGNATURE SHOULD be a Detached Signature as defined by the XML Signature specification");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3103", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3001");
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitLdcInsn("Any SIG_REFERENCE SHOULD contain a URI attribute containing a Shorthand XPointer");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3001", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3003");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitLdcInsn("Any SIG_REFERENCE to a SIGNATURE or descendant of a SIGNATURE MUST contain a URI attribute with a reference value that is a Shorthand XPointer to Local ID attribute defined by XML Signature");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3003", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3004");
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitLdcInsn("Any SIG_REFERENCE to an element defined in XML Encryption MUST contain a URI attribute with a reference value that is a Shorthand XPointer to Local ID attribute defined by XML Encryption");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3004", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3005");
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitLdcInsn("Any SIG_REFERENCE to an element that is not defined in XML Encryption, a SIGNATURE, or a descendant of a SIGNATURE SHOULD contain a URI attribute with a reference value that is a Shorthand XPointer to a wsu:Id attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3005", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3002");
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitLdcInsn("Any SIG_REFERENCE to an element that does not have an ID attribute MUST contain a TRANSFORM with an Algorithm attribute value of \"http://www.w3.org/2002/06/xmldsig-filter2\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3002", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5416");
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitLdcInsn("Any SIG_REFERENCE MUST contain a SIG_TRANSFORMS child element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5416", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5411");
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitLdcInsn("Any SIG_TRANSFORMS MUST contain at least one SIG_TRANSFORM child element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5411", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5423");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitLdcInsn("Any SIG_TRANSFORM Algorithm attribute MUST have a value of \"http://www.w3.org/2001/10/xml-exc-c14n#\" or \"http://www.w3.org/2002/06/xmldsig-filter2\" or \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#STR-Transform\" or \"http://www.w3.org/2000/09/xmldsig#enveloped-signature\" or \"http://docs.oasis-open.org/wss/oasis-wss-SwAProfile-1.1#Attachment-Content-Signature-Transform\" or \"http://docs.oasis-open.org/wss/oasis-wss-SwAProfile-1.1#Attachment-Complete-Signature-Transform\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5423", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5412");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitLdcInsn("Any SIG_TRANSFORMS MUST contain as its last child a SIG_TRANSFORM with an Algorithm attribute with a value of \"http://www.w3.org/2001/10/xml-exc-c14n#\" or \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#STR-Transform\" or \"http://docs.oasis-open.org/wss/oasis-wss-SwAProfile-1.1#Attachment-Content-Signature-Transform\" or \"http://docs.oasis-open.org/wss/oasis-wss-SwAProfile-1.1#Attachment-Complete-Signature-Transform\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5412", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5407");
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitLdcInsn("Any SIG_TRANSFORM with an Algorithm attribute with a value of \"http://www.w3.org/2001/10/xml-exc-c14n#\" MUST contain an INCLUSIVE_NAMESPACES with an PrefixList attribute unless the PrefixList is empty");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5407", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5413");
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitLdcInsn("Any SIG_TRANSFORM with an Algorithm attribute with a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#STR-Transform\" MUST have an INCLUSIVE_NAMESPACES with an PrefixList attribute unless the PrefixList is empty");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5413", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3065");
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitLdcInsn("Any SIG_TRANSFORM with an Algorithm attribute with a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#STR-Transform\" MUST contain a child wsse:TransformationParameters element containing a child ds:CanonicalizationMethod element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3065", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5404");
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitLdcInsn("Any CANONICALIZATION_METHOD Algorithm attribute MUST have a value of \"http://www.w3.org/2001/10/xml-exc-c14n#\" indicating that it uses Exclusive C14N without comments for canonicalization");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5404", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5406");
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitLdcInsn("Any CANONICALIZATION_METHOD MUST contain an INCLUSIVE_NAMESPACES with a PrefixList attribute unless the PrefixList is empty");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5406", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5414");
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitLdcInsn("A RECEIVER MUST be capable of accepting and processing an INCLUSIVE_NAMESPACES PrefixList attribute containing prefixes in any order within the string");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5414", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5415");
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitLdcInsn("A RECEIVER MUST be capable of accepting and processing an INCLUSIVE_NAMESPACES PrefixList attribute containing arbitrary whitespace before, after and between the prefixes within the string");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5415", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5405");
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitLdcInsn("Any INCLUSIVE_NAMESPACES MUST contain the prefix of all namespaces that are in-scope and desired to be protected, but not visibly utilized, for the element being signed and its descendants, per Exclusive XML Canonicalization Version 1.0");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5405", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5408");
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitLdcInsn("Any INCLUSIVE_NAMESPACES MUST contain the string \"#default\" if a default namespace is in-scope and desired to be protected, but not visibly utilized, for the element being signed and its descendants, per Exclusive XML Canonicalization Version 1.0");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5408", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5420");
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitLdcInsn("Any DIGEST_METHOD Algorithm attribute SHOULD have the value \"http://www.w3.org/2000/09/xmldsig#sha1\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5420", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5421");
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitLdcInsn("Any SIGNATURE_METHOD Algorithm attribute SHOULD have a value of \"http://www.w3.org/2000/09/xmldsig#hmac-sha1\" or \"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5421", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5401");
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitLdcInsn("Any SIGNATURE_METHOD MUST NOT contain a ds:HMACOutputLength child element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5401", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5402");
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitLdcInsn("Any SIG_KEY_INFO MUST contain exactly one child element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5402", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5417");
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitLdcInsn("Any SIG_KEY_INFO MUST contain a SECURITY_TOKEN_REFERENCE child element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5417", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5403");
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitLdcInsn("A SIGNATURE MUST NOT contain a ds:Manifest descendant element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5403", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5440");
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitLdcInsn("A SIGNATURE MUST NOT have any xenc:EncryptedData elements amongst its descendants");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5440", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5441");
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitLdcInsn("A SIGNATURE_CONFIRMATION MUST contain a wsu:Id attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5441", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3228");
methodVisitor.visitIntInsn(BIPUSH, 65);
methodVisitor.visitLdcInsn("A soap:Header element in a SECURE_ENVELOPE MUST NOT contain any child ENCRYPTED_DATA");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3228", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3299");
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitLdcInsn("A soap:Header element in a SECURE_ENVELOPE MAY contain ENCRYPTED_HEADER children");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3299", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3230");
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitLdcInsn("An ENCRYPTED_HEADER MUST NOT contain any children other than a single required ENCRYPTED_DATA");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3230", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3232");
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitLdcInsn("In cases where a wsu:Id does exist on the ENCRYPTED_HEADER, the child ENCRYPTED_DATA MAY contain an Id attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3232", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3205");
methodVisitor.visitIntInsn(BIPUSH, 69);
methodVisitor.visitLdcInsn("Any ENC_REFERENCE_LIST produced as part of an encryption step MUST use a single key");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3205", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3231");
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitLdcInsn("Any ENC_REFERENCE_LIST MUST contain an xenc:DataReference element for each ENCRYPTED_DATA produced in the associated encryption step");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3231", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3214");
methodVisitor.visitIntInsn(BIPUSH, 71);
methodVisitor.visitLdcInsn("Any EK_REFERENCE_LIST MUST contain a xenc:DataReference for each ENCRYPTED_DATA produced in the associated encryption step");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3214", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3208");
methodVisitor.visitIntInsn(BIPUSH, 72);
methodVisitor.visitLdcInsn("Any ENCRYPTED_KEY MUST precede any ENCRYPTED_DATA in the same SECURITY_HEADER referenced by the associated EK_REFERENCE_LIST");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3208", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3209");
methodVisitor.visitIntInsn(BIPUSH, 73);
methodVisitor.visitLdcInsn("Any ENCRYPTED_KEY MUST NOT specify a Type attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3209", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5622");
methodVisitor.visitIntInsn(BIPUSH, 74);
methodVisitor.visitLdcInsn("Any ENCRYPTED_KEY MUST NOT specify a MimeType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5622", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5623");
methodVisitor.visitIntInsn(BIPUSH, 75);
methodVisitor.visitLdcInsn("Any ENCRYPTED_KEY MUST NOT specify a Encoding attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5623", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5602");
methodVisitor.visitIntInsn(BIPUSH, 76);
methodVisitor.visitLdcInsn("Any ENCRYPTED_KEY MUST NOT contain a Recipient attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5602", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5603");
methodVisitor.visitIntInsn(BIPUSH, 77);
methodVisitor.visitLdcInsn("Any ENCRYPTED_KEY MUST contain an xenc:EncryptionMethod child element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5603", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5629");
methodVisitor.visitIntInsn(BIPUSH, 78);
methodVisitor.visitLdcInsn("An ENCRYPTED_DATA which is not referenced from an ENCRYPTED_KEY MUST contain a ds:KeyInfo");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5629", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5624");
methodVisitor.visitIntInsn(BIPUSH, 79);
methodVisitor.visitLdcInsn("In cases where a wsu:Id does not exist on the ENCRYPTED_HEADER, the child ENCRYPTED_DATA MUST contain an ID attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5624", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5627");
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitLdcInsn("In cases where an ID does not exist on the ENCRYPTED_DATA, the parent ENCRYPTED_HEADER MUST contain a wsu:Id attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5627", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5601");
methodVisitor.visitIntInsn(BIPUSH, 81);
methodVisitor.visitLdcInsn("Any ENCRYPTED_DATA MUST contain an xenc:EncryptionMethod child element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5601", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5424");
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitLdcInsn("Any ENC_KEY_INFO MUST have exactly one child element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5424", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5426");
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitLdcInsn("Any ENC_KEY_INFO MUST contain a child SECURITY_TOKEN_REFERENCE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5426", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5608");
methodVisitor.visitIntInsn(BIPUSH, 84);
methodVisitor.visitLdcInsn("Any ENC_DATA_REFERENCE MUST contain a URI attribute containing a Shorthand XPointer reference value based on either the Id attribute of the referenced ENCRYPTED_DATA or the wsu:Id attribute of the referenced ENCRYPTED_HEADER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5608", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3006");
methodVisitor.visitIntInsn(BIPUSH, 85);
methodVisitor.visitLdcInsn("Any EK_DATA_REFERENCE MUST contain a URI attribute containing a Shorthand XPointer reference value based on either the Id attribute of the referenced ENCRYPTED_DATA or the wsu:Id attribute of the referenced ENCRYPTED_HEADER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3006", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5613");
methodVisitor.visitIntInsn(BIPUSH, 86);
methodVisitor.visitLdcInsn("Any ENC_KEY_REFERENCE MUST contain a URI attribute containing a Shorthand XPointer reference value based on the Id attribute of the referred to ENCRYPTED_KEY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5613", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3007");
methodVisitor.visitIntInsn(BIPUSH, 87);
methodVisitor.visitLdcInsn("Any EK_KEY_REFERENCE MUST contain a URI attribute containing a Shorthand XPointer reference value based on the Id attribute of the referred to ENCRYPTED_KEY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3007", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5620");
methodVisitor.visitIntInsn(BIPUSH, 88);
methodVisitor.visitLdcInsn("Any ED_ENCRYPTION_METHOD Algorithm attribute MUST have a value of \"http://www.w3.org/2001/04/xmlenc#tripledes-cbc\", \"http://www.w3.org/2001/04/xmlenc#aes128-cbc\" or \"http://www.w3.org/2001/04/xmlenc#aes256-cbc\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5620", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5621");
methodVisitor.visitIntInsn(BIPUSH, 89);
methodVisitor.visitLdcInsn("When used for Key Transport, any EK_ENCRYPTION_METHOD Algorithm attribute MUST have a value of \"http://www.w3.org/2001/04/xmlenc#rsa-1_5\" or \"http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5621", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5625");
methodVisitor.visitIntInsn(BIPUSH, 90);
methodVisitor.visitLdcInsn("When used for Key Wrap, any EK_ENCRYPTION_METHOD Algorithm attribute MUST have a value of \"http://www.w3.org/2001/04/xmlenc#kw-tripledes\", \"http://www.w3.org/2001/04/xmlenc#kw-aes128\", or \"http://www.w3.org/2001/04/xmlenc#kw-aes256\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5625", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5626");
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitLdcInsn("Any EK_ENCRYPTION_METHOD Algorithm attribute MUST have a value of \"http://www.w3.org/2001/04/xmlenc#rsa-1_5\" or \"http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p\" or \"http://www.w3.org/2001/04/xmlenc#kw-tripledes\" or \"http://www.w3.org/2001/04/xmlenc#kw-aes128\" or \"http://www.w3.org/2001/04/xmlenc#kw-aes256\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5626", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5614");
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitLdcInsn("A HEADER encrypted as a result of an encryption step MUST be replaced by a corresponding ENCRYPTED_HEADER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5614", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5606");
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitLdcInsn("Any encrypted element or element content within a SECURE_ENVELOPE, encrypted as a result of an encryption step, MUST be replaced by a corresponding ENCRYPTED_DATA, unless the element is a HEADER_ELEMENT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5606", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3029");
methodVisitor.visitIntInsn(BIPUSH, 94);
methodVisitor.visitLdcInsn("Any BINARY_SECURITY_TOKEN MUST specify an EncodingType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3029", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3030");
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitLdcInsn("Any BINARY_SECURITY_TOKEN EncodingType attribute MUST have a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3030", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3031");
methodVisitor.visitIntInsn(BIPUSH, 96);
methodVisitor.visitLdcInsn("Any BINARY_SECURITY_TOKEN MUST specify an ValueType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3031", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3032");
methodVisitor.visitIntInsn(BIPUSH, 97);
methodVisitor.visitLdcInsn("Any BINARY_SECURITY_TOKEN ValueType attribute MUST have a value specified by the related security token profile");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3032", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4222");
methodVisitor.visitIntInsn(BIPUSH, 98);
methodVisitor.visitLdcInsn("Any USERNAME_TOKEN MUST NOT have more than one PASSWORD");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4222", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4201");
methodVisitor.visitIntInsn(BIPUSH, 99);
methodVisitor.visitLdcInsn("Any PASSWORD MUST specify a Type attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4201", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4212");
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitLdcInsn("Any PASSWORD with a Type attribute value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest\" MUST have its value computed using the following formula, where \"+\" indicates concatenation: Password_Digest = Base64 ( SHA-1 ( nonce + created + password ) ). That is, concatenate the text forms of the nonce, creation time, and the password (or shared secret or password equivalent), digest the combination using the SHA-1 hash algorithm, then include the Base64 encoding of that result as the password (digest). Any elements that are not present are simply omitted from the concatenation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4212", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4216");
methodVisitor.visitIntInsn(BIPUSH, 101);
methodVisitor.visitLdcInsn("When a SECURITY_TOKEN_REFERENCE, within a SIGNATURE or ENCRYPTED_KEY, refers to a SECURITY_TOKEN named wsse:UsernameToken to derive a key, the key MUST be derived using the algorithm specified in Section 4 of Web Services Security: UsernameToken Profile 1.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4216", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4217");
methodVisitor.visitIntInsn(BIPUSH, 102);
methodVisitor.visitLdcInsn("When a SECURITY_TOKEN_REFERENCE, within a SIGNATURE or ENCRYPTED_KEY, refers to a SECURITY_TOKEN named wsse:UsernameToken to derive a key, the SECURITY_TOKEN MUST contain a wsse11:Salt child element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4217", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4218");
methodVisitor.visitIntInsn(BIPUSH, 103);
methodVisitor.visitLdcInsn("When a SECURITY_TOKEN_REFERENCE, within a SIGNATURE or ENCRYPTED_KEY, refers to a SECURITY_TOKEN named wsse:UsernameToken to derive a key, the SECURITY_TOKEN MUST contain a wsse11:Iteration child element with a value greater than or equal to 1000");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4218", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4223");
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitLdcInsn("Any USERNAME_TOKEN MUST NOT have more than one CREATED");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4223", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4225");
methodVisitor.visitIntInsn(BIPUSH, 105);
methodVisitor.visitLdcInsn("Any USERNAME_TOKEN MUST NOT have more than one NONCE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4225", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4220");
methodVisitor.visitIntInsn(BIPUSH, 106);
methodVisitor.visitLdcInsn("Any NONCE MUST specify an EncodingType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4220", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4221");
methodVisitor.visitIntInsn(BIPUSH, 107);
methodVisitor.visitLdcInsn("Any NONCE EncodingType attribute MUST have a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4221", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4214");
methodVisitor.visitIntInsn(BIPUSH, 108);
methodVisitor.visitLdcInsn("Any STR_REFERENCE to a USERNAME_TOKEN MUST have a ValueType attribute with a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#UsernameToken\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4214", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R4215");
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE to a USERNAME_TOKEN MUST NOT contain an STR_KEY_IDENTIFIER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4215", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3033");
methodVisitor.visitIntInsn(BIPUSH, 110);
methodVisitor.visitLdcInsn("Any X509_TOKEN MUST contain a ValueType attribute with a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3033", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5201");
methodVisitor.visitIntInsn(BIPUSH, 111);
methodVisitor.visitLdcInsn("Any BINARY_SECURITY_TOKEN containing an X.509 Certificate Path MUST be either a PKCS7_TOKEN or a PKIPATH_TOKEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5201", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5202");
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitLdcInsn("Any BINARY_SECURITY_TOKEN containing an X.509 Certificate Path SHOULD be a PKIPATH_TOKEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5202", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5211");
methodVisitor.visitIntInsn(BIPUSH, 113);
methodVisitor.visitLdcInsn("Any PKCS7_TOKEN MUST contain a ValueType attribute with a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#PKCS7\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5211", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5218");
methodVisitor.visitIntInsn(BIPUSH, 114);
methodVisitor.visitLdcInsn("Any STR_REFERENCE to a X509_TOKEN MUST contain a ValueType attribute with a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5218", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5212");
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE to a PKCS7_TOKEN MUST contain a wsse11:TokenType attribute with a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#PKCS7\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5212", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5213");
methodVisitor.visitIntInsn(BIPUSH, 116);
methodVisitor.visitLdcInsn("Any STR_REFERENCE to a PKCS7_TOKEN MUST contain a ValueType attribute with a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#PKCS7\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5213", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5214");
methodVisitor.visitIntInsn(BIPUSH, 117);
methodVisitor.visitLdcInsn("Any PKIPATH_TOKEN MUST contain a ValueType attribute with a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509PKIPathv1\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5214", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5215");
methodVisitor.visitIntInsn(BIPUSH, 118);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE to a PKIPATH_TOKEN MUST contain a wsse11:TokenType attribute with a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509PKIPathv1\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5215", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5216");
methodVisitor.visitIntInsn(BIPUSH, 119);
methodVisitor.visitLdcInsn("Any STR_REFERENCE to a PKIPATH_TOKEN MUST contain a ValueType attribute with a value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509PKIPathv1\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5216", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5209");
methodVisitor.visitIntInsn(BIPUSH, 120);
methodVisitor.visitLdcInsn("When a SECURITY_TOKEN_REFERENCE references an EXTERNAL_SECURITY_TOKEN that cannot be referred to using an STR_REFERENCE but can be referred to using an STR_KEY_IDENTIFIER or STR_ISSUER_SERIAL, an STR_KEY_IDENTIFIER or STR_ISSUER_SERIAL MUST be used");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5209", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5206");
methodVisitor.visitIntInsn(BIPUSH, 121);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER that references an X509_TOKEN MUST have a ValueType attribute with the value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509SubjectKeyIdentifier\" or \"http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#ThumbprintSHA1\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5206", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5208");
methodVisitor.visitIntInsn(BIPUSH, 122);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER that references an X509_TOKEN and has a ValueType attribute with the value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509SubjectKeyIdentifier\" MUST contain the value of the token's SubjectKeyIdentifier extension");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5208", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5210");
methodVisitor.visitIntInsn(BIPUSH, 123);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER that references an X509_TOKEN which does not contain a SubjectKeyIdentifier extension MUST have a ValueType attribute with the value of \"http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#ThumbprintSHA1\" and MUST contain the value of the SHA1 of the raw octets of the X509_TOKEN that is referenced");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5210", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R5409");
methodVisitor.visitIntInsn(BIPUSH, 124);
methodVisitor.visitLdcInsn("Any STR_ISSUER_SERIAL MUST contain a value following the encoding rules specified in the XML Signature specification for DNames");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5409", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6304");
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitLdcInsn("Any STR_REFERENCE to a REL_TOKEN MUST contain a ValueType attribute with a value of \"http://docs.oasis-open.org/wss/oasis-wss-rel-token-profile-1.0.pdf#license\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6304", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6301");
methodVisitor.visitIntInsn(BIPUSH, 126);
methodVisitor.visitLdcInsn("Any STR_REFERENCE to a INTERNAL_SECURITY_TOKEN that is an REL_TOKEN containing a wsu:Id attribute, MUST NOT use a licenseId reference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6301", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6302");
methodVisitor.visitIntInsn(BIPUSH, 127);
methodVisitor.visitLdcInsn("Any SECURITY_HEADER child elements MUST be ordered so that any SIGNATURE necessary to verify the issuance of an REL_TOKEN precedes the first SECURITY_TOKEN_REFERENCE that refers to that REL_TOKEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6302", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6902");
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitLdcInsn("Any KERBEROS_TOKEN MUST contain a ValueType attribute with a value of \"http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6902", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6903");
methodVisitor.visitIntInsn(SIPUSH, 129);
methodVisitor.visitLdcInsn("Any KERBEROS_TOKEN MUST be an INTERNAL_SECURITY_TOKEN in the initial SECURE_ENVELOPE of an authenticated message exchange between a SENDER and RECEIVER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6903", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6904");
methodVisitor.visitIntInsn(SIPUSH, 130);
methodVisitor.visitLdcInsn("Any KERBEROS_TOKEN MUST be an EXTERNAL_SECURITY_TOKEN in each SECURE_ENVELOPE after the initial SECURE_ENVELOPE of an authenticated message exchange between a SENDER and RECEIVER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6904", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6907");
methodVisitor.visitIntInsn(SIPUSH, 131);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE to a KERBEROS_TOKEN MUST contain a wsse11:TokenType attribute with a value of \"http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6907", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6906");
methodVisitor.visitIntInsn(SIPUSH, 132);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER to a KERBEROS_TOKEN MUST contain a ValueType attribute with a value of \"http://docs.oasis-open.org/wss/oasis-wss-kerberos-tokenprofile-1.1#Kerberosv5APREQSHA1\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6906", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6905");
methodVisitor.visitIntInsn(SIPUSH, 133);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE to an EXTERNAL_SECURITY_TOKEN which is a KERBEROS_TOKEN MUST contain an STR_KEY_IDENTIFIER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6905", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6601");
methodVisitor.visitIntInsn(SIPUSH, 134);
methodVisitor.visitLdcInsn("Any SAML_SC_KEY_INFO MUST NOT contain a reference to a SAML_TOKEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6601", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6611");
methodVisitor.visitIntInsn(SIPUSH, 135);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE to a SAML_V1_1_TOKEN MUST contain a wsse11:TokenType attribute with a value of \"http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV1.1\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6611", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6617");
methodVisitor.visitIntInsn(SIPUSH, 136);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE to a SAML_V2_0_TOKEN MUST contain a wsse11:TokenType attribute with a value of \"http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV2.0\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6617", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6614");
methodVisitor.visitIntInsn(SIPUSH, 137);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE that references an INTERNAL_SAML_V2_0_TOKEN using a STR_REFERENCE MUST NOT contain a ValueType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6614", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6602");
methodVisitor.visitIntInsn(SIPUSH, 138);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER that references a INTERNAL_SAML_TOKEN MUST include a ValueType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6602", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6609");
methodVisitor.visitIntInsn(SIPUSH, 139);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER that references a EXTERNAL_SAML_TOKEN MUST include a ValueType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6609", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6603");
methodVisitor.visitIntInsn(SIPUSH, 140);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER ValueType attribute that references a SAML_V1_1_TOKEN MUST have a value of \"http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.0#SAMLAssertionID\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6603", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6616");
methodVisitor.visitIntInsn(SIPUSH, 141);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER ValueType attribute that references a SAML_V2_0_TOKEN MUST have a value of \"http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLID\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6616", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6604");
methodVisitor.visitIntInsn(SIPUSH, 142);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER that references a SAML_TOKEN MUST NOT include an EncodingType attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6604", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6605");
methodVisitor.visitIntInsn(SIPUSH, 143);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER that references a SAML_TOKEN MUST have a value encoded as an xs:string");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6605", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6610");
methodVisitor.visitIntInsn(SIPUSH, 144);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE that references an INTERNAL_SAML_TOKEN that has an ID attribute, the reference MUST contain an STR_REFERENCE or an STR_EMBEDDED");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6610", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6612");
methodVisitor.visitIntInsn(SIPUSH, 145);
methodVisitor.visitLdcInsn("Any SIG_REFERENCE to a SECURITY_TOKEN_REFERENCE which contains an STR_EMBEDDED which contains an INTERNAL_SAML_V2_0_TOKEN MUST NOT include a SIG_TRANSFORM with an Algorithm attribute value of \"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#STR-Transform\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6612", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6606");
methodVisitor.visitIntInsn(SIPUSH, 146);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE that references an EXTERNAL_SAML_TOKEN MUST contain a SAML_AUTHORITY_BINDING");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6606", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6607");
methodVisitor.visitIntInsn(SIPUSH, 147);
methodVisitor.visitLdcInsn("Any AuthorityKind attribute of a SAML_AUTHORITY_BINDING MUST have a value of saml:AssertionIDReference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6607", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6608");
methodVisitor.visitIntInsn(SIPUSH, 148);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE that references an INTERNAL_SAML_TOKEN MUST NOT contain a SAML_AUTHORITY_BINDING");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6608", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R6613");
methodVisitor.visitIntInsn(SIPUSH, 149);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE to an EXTERNAL_SAML_V2_0_TOKEN MUST contain an STR_REFERENCE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6613", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3069");
methodVisitor.visitIntInsn(SIPUSH, 150);
methodVisitor.visitLdcInsn("Any SECURITY_TOKEN_REFERENCE to a ENCRYPTED_KEY_TOKEN MUST contain a wsse11:TokenType attribute with a value of \"http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3069", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("R3072");
methodVisitor.visitIntInsn(SIPUSH, 151);
methodVisitor.visitLdcInsn("Any STR_KEY_IDENTIFIER element in a SECURITY_TOKEN_REFERENCE that refers to an ENCRYPTED_KEY_TOKEN MUST contain a ValueType attribute with a value of \"http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKeySHA1\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/bsp/BSPRule", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3072", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitIntInsn(SIPUSH, 152);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/wss4j/common/bsp/BSPRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3203", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3224", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3221", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3222", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3220", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3229", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3213", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3215", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3225", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3226", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3217", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3223", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3227", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3061", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3074", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3057", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3064", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3059", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3058", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3062", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3027", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3054", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3063", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3070", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3071", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3060", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3025", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3056", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3022", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3023", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5204", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5205", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3066", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3067", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3024", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3211", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3102", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3104", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3103", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3001", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3003", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3004", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3005", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3002", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5416", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5411", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5423", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5412", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5407", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5413", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3065", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5404", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5406", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5414", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5415", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5405", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5408", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5420", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5421", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5401", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5402", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5417", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5403", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5440", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5441", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 65);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3228", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3299", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3230", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3232", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 69);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3205", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3231", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 71);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3214", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 72);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3208", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 73);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3209", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 74);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5622", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 75);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5623", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 76);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5602", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 77);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5603", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 78);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5629", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 79);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5624", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5627", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 81);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5601", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5424", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5426", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 84);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5608", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 85);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3006", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 86);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5613", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 87);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3007", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 88);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5620", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 89);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5621", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 90);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5625", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5626", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5614", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5606", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 94);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3029", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3030", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 96);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3031", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 97);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3032", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 98);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4222", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 99);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4201", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4212", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 101);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4216", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 102);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4217", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 103);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4218", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4223", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 105);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4225", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 106);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4220", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 107);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4221", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 108);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4214", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R4215", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 110);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3033", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 111);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5201", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5202", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 113);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5211", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 114);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5218", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5212", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 116);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5213", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 117);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5214", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 118);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5215", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 119);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5216", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 120);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5209", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 121);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5206", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 122);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5208", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 123);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5210", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 124);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5409", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6304", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 126);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6301", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 127);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6302", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6902", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 129);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6903", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 130);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6904", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 131);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6907", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 132);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6906", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 133);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6905", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 134);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6601", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 135);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6611", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 136);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6617", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 137);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6614", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 138);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6602", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 139);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6609", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 140);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6603", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 141);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6616", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 142);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6604", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 143);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6605", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 144);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6610", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 145);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6612", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 146);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6606", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 147);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6607", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 148);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6608", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 149);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R6613", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 150);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3069", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 151);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R3072", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "$VALUES", "[Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
